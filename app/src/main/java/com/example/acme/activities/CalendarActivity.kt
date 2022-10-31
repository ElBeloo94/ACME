package com.example.acme.activities

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.applandeo.materialcalendarview.CalendarView
import com.applandeo.materialcalendarview.EventDay
import com.example.acme.R
import com.example.acme.data.db.DatabaseACME
import com.example.acme.data.repository.ServiceRepository
import com.example.acme.data.viewModel.ServiceViewModel
import com.example.acme.data.viewModel.ServiceViewModelFactory
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*


class CalendarActivity : AppCompatActivity() {

    private lateinit var viewModel: ServiceViewModel
    private lateinit var ServiceDataBase: DatabaseACME
    private lateinit var repository: ServiceRepository
    private lateinit var factory: ServiceViewModelFactory

    var events: ArrayList<EventDay> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        val sharedPreference =  getSharedPreferences("PREFERENCE_NAME", Context.MODE_PRIVATE)
        val id = sharedPreference.getInt("id",0)
        ServiceDataBase = DatabaseACME.getDatabase(this)
        repository = ServiceRepository(ServiceDataBase)
        factory = ServiceViewModelFactory(repository)
        viewModel = ViewModelProvider(this, factory)[ServiceViewModel::class.java]

        val calendarView = findViewById<CalendarView>(R.id.calendarView)

        viewModel.getAllService().observe(this) { services ->
            services.map {
                if (it.idUser == id) {
                    val date = it.date
                    val formatter: DateFormat = SimpleDateFormat("dd-MM-yyyy")
                    val date1 = formatter.parse(date!!)
                    val calendar = Calendar.getInstance()
                    calendar.time = date1!!
                    events.add(
                        EventDay(
                            calendar,
                            com.example.acme.R.drawable.ic_baseline_sticky_note_2_24,
                            Color.parseColor("#228B22")
                        )
                    )
                }
            }
        }



        calendarView.setEvents(events);
    }


}