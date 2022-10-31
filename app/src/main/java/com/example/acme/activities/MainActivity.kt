package com.example.acme.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.PopupMenu
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.acme.R
import com.example.acme.adapter.ServAdapter
import com.example.acme.data.db.DatabaseACME
import com.example.acme.data.db.model.ServiceModel
import com.example.acme.data.repository.ServiceRepository
import com.example.acme.data.viewModel.ServiceViewModel
import com.example.acme.data.viewModel.ServiceViewModelFactory
import java.text.DateFormat
import java.text.SimpleDateFormat

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: ServiceViewModel
    private lateinit var ServiceDataBase: DatabaseACME
    private lateinit var repository: ServiceRepository
    private lateinit var factory: ServiceViewModelFactory


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPreference = getSharedPreferences("PREFERENCE_NAME", Context.MODE_PRIVATE)
        val idUser = sharedPreference.getInt("id", 0)

        //@todo bad practice because boilerplate code, but we'll be change this later using DI.
        ServiceDataBase = DatabaseACME.getDatabase(this)
        repository = ServiceRepository(ServiceDataBase)
        factory = ServiceViewModelFactory(repository)
        viewModel = ViewModelProvider(this, factory)[ServiceViewModel::class.java]

        val recyclerview = findViewById<RecyclerView>(R.id.my_recycler_view)
        val new_ticket = findViewById<ImageView>(R.id.new_ticket)
        val calendar = findViewById<ImageView>(R.id.calendar_image)
        val sync = findViewById<ImageView>(R.id.sync_image)
        val menu = findViewById<ImageView>(R.id.menu_image)

        val showPopUp = PopupMenu(
            this,
            menu
        )

        showPopUp.menu.add(Menu.NONE, 1, 1, "Get Map")
        showPopUp.menu.add(Menu.NONE, 2, 2, "Out")

        showPopUp.setOnMenuItemClickListener { menuItem ->
            val  id = menuItem.itemId
            if(id==1){
                val intent = Intent(this, GoogleMaps::class.java)
                startActivity(intent)
            }
            else if (id==2){
                finish()
            }
            false
        }
        menu.setOnClickListener {
            showPopUp.show()
        }


        new_ticket.setOnClickListener {
            val intent = Intent(this, InsertServiceActivity::class.java)
            //finish()
            startActivity(intent)
        }
        calendar.setOnClickListener {
            val intent = Intent(this, CalendarActivity::class.java)
            //finish()
            startActivity(intent)
        }

        sync.setOnClickListener {
            viewModel.getAllService().observe(this, Observer { services ->
                services.map {
                    val mIntent: Intent
                    if (it.idUser == idUser){
                        val date = it.date
                        val formatter: DateFormat = SimpleDateFormat("dd-MM-yyyy")
                        val date1 = formatter.parse(date!!)
                        mIntent = Intent(Intent.ACTION_EDIT)
                        mIntent.type = "vnd.android.cursor.item/event"
                        mIntent.putExtra("beginTime", date1)
                        mIntent.putExtra("time", true)
                        mIntent.putExtra("rule", "FREQ=YEARLY")
                        //mIntent.putExtra("endTime", mEndTime.time)
                        mIntent.putExtra("title", it.serviceType)
                        startActivity(mIntent)
                    }
                }
            })

        }

        recyclerview.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<ServiceModel>()
        viewModel.getAllService().observe(this, Observer { services ->
            services.map {
                    if (it.idUser == idUser) {
                        data.add(it)
                    }
                if (data.isNotEmpty()) {
                    val adapter = ServAdapter(this, data)
                    recyclerview.adapter = adapter
                }
            }
        })
    }
}
