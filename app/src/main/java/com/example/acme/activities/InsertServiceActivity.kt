package com.example.acme.activities

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModelProvider
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.datetime.datePicker
import com.example.acme.R
import com.example.acme.data.db.DatabaseACME
import com.example.acme.data.repository.ServiceRepository
import com.example.acme.data.viewModel.ServiceViewModel
import com.example.acme.data.viewModel.ServiceViewModelFactory
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import com.example.acme.data.db.model.ServiceModel
import java.text.SimpleDateFormat
import java.util.*

class InsertServiceActivity : AppCompatActivity() {
    private lateinit var viewModel: ServiceViewModel
    private lateinit var ServiceDataBase: DatabaseACME
    private lateinit var repository: ServiceRepository
    private lateinit var factory: ServiceViewModelFactory

    private lateinit var name: EditText
    private lateinit var phone: EditText
    private lateinit var street: EditText
    private lateinit var city: EditText
    private lateinit var country: EditText
    private lateinit var postalCode: EditText
    private lateinit var addButton: Button
    private lateinit var date: EditText
    private lateinit var ditpach: EditText
    private lateinit var type: EditText
    private lateinit var dept: EditText
    private lateinit var reason: EditText



    @SuppressLint("SimpleDateFormat")
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert_service)


        //@todo bad practice because boilerplate code, but we'll be change this later using DI.
        ServiceDataBase = DatabaseACME.getDatabase(this)
        repository = ServiceRepository(ServiceDataBase)
        factory = ServiceViewModelFactory(repository)
        viewModel = ViewModelProvider(this, factory)[ServiceViewModel::class.java]

        initView()

        val sharedPreference =  getSharedPreferences("PREFERENCE_NAME", Context.MODE_PRIVATE)
        val id = sharedPreference.getInt("id",0)

        date.isFocusable = false
        date.isClickable = true

        date.setOnClickListener {
            MaterialDialog(this).show {
                datePicker(dateCallback = fun(_: MaterialDialog, datetime: Calendar) {
                    val format: SimpleDateFormat = SimpleDateFormat("dd-MM-yyyy")
                    date.setText(format.format(datetime.time))
                })

            }
        }

                addButton.setOnClickListener {
                    if ((name.text.toString() == "") ||
                        (phone.text.toString() == "") ||
                        (postalCode.text.toString() == "Postal Code") ||
                        (ditpach.text.toString() == "") ||
                        (type.text.toString() == "") ||
                        (dept.text.toString() == "") ||
                        (reason.text.toString() == "") ||
                        (date.text.toString() == "")){
                        Toast.makeText(this, "Please enter requeried field", Toast.LENGTH_SHORT).show()
                    }else{
                        insertar(id)
                    }

        }



    }

    private fun insertar(user: Int) {

        val insert = ServiceModel(
            id = null,
            idUser = user,
            name = name.text.toString(),
            phone = phone.text.toString(),
            street = street.text.toString(),
            city = city.text.toString(),
            country = country.text.toString(),
            postalCode = postalCode.text.toString(),
            date = date.text.toString(),
            dispatchNote = ditpach.text.toString(),
            serviceType = type.text.toString(),
            department = dept.text.toString(),
            reason = reason.text.toString()
        )
        CoroutineScope(Dispatchers.Main).launch {
            viewModel.insertService(insert).also {
                val sharedPreference =  getSharedPreferences("PREFERENCE_NAME", Context.MODE_PRIVATE)
                val editor = sharedPreference.edit()
                //editor.putInt("id",insert.idUser!!)
                editor.putString("name", name.text.toString())
                editor.putString("phone", phone.text.toString())
                editor.putString("street", street.text.toString())
                editor.putString("city", city.text.toString())
                editor.putString("country", country.text.toString())
                editor.putString("postalCode", postalCode.text.toString())
                editor.putString("date",  date.text.toString())
                editor.putString("dispatchNote", ditpach.text.toString())
                editor.putString("serviceType", type.text.toString())
                editor.putString("department", dept.text.toString())
                editor.putString("reason", reason.text.toString())
                editor.apply()
                var inten = Intent(this@InsertServiceActivity, WorkTicketActivity::class.java)
                finish()
                startActivity(inten)
            }
        }
    }
    private fun initView() {
        name = findViewById(R.id.name)
        phone = findViewById(R.id.userPhone)
        street = findViewById(R.id.street)
        city = findViewById(R.id.city)
        country= findViewById(R.id.country)
        postalCode = findViewById(R.id.postalCode)
        addButton = findViewById(R.id.insertarService)
        date = findViewById(R.id.fechaInsertar)
        ditpach = findViewById(R.id.dispatchNote)
        type = findViewById(R.id.type)
        dept = findViewById(R.id.dept)
        reason= findViewById(R.id.reasonCall)
    }
}