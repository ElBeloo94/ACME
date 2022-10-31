package com.example.acme.activities

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.datetime.datePicker
import com.example.acme.R
import com.example.acme.data.db.DatabaseACME
import com.example.acme.data.db.model.ServiceModel
import com.example.acme.data.repository.ServiceRepository
import com.example.acme.data.viewModel.ServiceViewModel
import com.example.acme.data.viewModel.ServiceViewModelFactory
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

class UpdateServiceActivity : AppCompatActivity() {

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
    private lateinit var ditpach: EditText
    private lateinit var type: EditText
    private lateinit var dept: EditText
    private lateinit var reason: EditText
    private lateinit var date: EditText
    private lateinit var deleteButton: Button

    @SuppressLint("SimpleDateFormat")
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_service)

        initView()

        val sharedPreference = getSharedPreferences("PREFERENCE_NAME", Context.MODE_PRIVATE)
        val id = sharedPreference.getInt("idService", 0)
        val idUser = sharedPreference.getInt("id", 0)
        ServiceDataBase = DatabaseACME.getDatabase(this)
        repository = ServiceRepository(ServiceDataBase)
        factory = ServiceViewModelFactory(repository)
        viewModel = ViewModelProvider(this, factory)[ServiceViewModel::class.java]

        name.setText(sharedPreference.getString("name", ""))
        phone.setText(sharedPreference.getString("phone", ""))
        street.setText(sharedPreference.getString("street", ""))
        city.setText(sharedPreference.getString("city", ""))
        country.setText(sharedPreference.getString("country", ""))
        postalCode.setText(sharedPreference.getString("postalCode", ""))
        date.setText(sharedPreference.getString("date", ""))
        ditpach.setText(sharedPreference.getString("dispatchNote", ""))
        type.setText(sharedPreference.getString("serviceType", ""))
        dept.setText(sharedPreference.getString("department", ""))
        reason.setText(sharedPreference.getString("reason", ""))

        date.isFocusable = false
        date.isClickable = true

        date.setOnClickListener {
            MaterialDialog(this).show {
                datePicker(dateCallback = fun(_: MaterialDialog, datetime: Calendar) {
                    val format = SimpleDateFormat("dd-MM-yyyy")

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
                (date.text.toString() == "")
            ) {
                Toast.makeText(this, "Please enter requeried field", Toast.LENGTH_SHORT).show()
            } else {
                update(idUser, id)
            }
        }

        deleteButton.setOnClickListener {
            CoroutineScope(Dispatchers.Main).launch {
                viewModel.deleteService(serviceUpdateOrDelete(idUser,id)).also {
                    finish()
                    val intent =
                        Intent(this@UpdateServiceActivity, MainActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }


    private fun serviceUpdateOrDelete(user: Int, id: Int): ServiceModel {
        val serviceUOD = ServiceModel(
            id = id,
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
        return serviceUOD
    }

    private fun update(user: Int, id: Int) {
        val serviceUpdate = serviceUpdateOrDelete(user, id)
        CoroutineScope(Dispatchers.Main).launch {
            viewModel.updateService(serviceUpdate).also {
                finish()
                val intent = Intent(this@UpdateServiceActivity, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun initView() {
        name = findViewById(R.id.nameUpdate)
        phone = findViewById(R.id.userPhoneUpdate)
        addButton = findViewById(R.id.update)
        deleteButton = findViewById(R.id.deleteUpdate)
        street = findViewById(R.id.streetUpdate)
        city = findViewById(R.id.cityUpdate)
        country = findViewById(R.id.countryUpdate)
        postalCode = findViewById(R.id.postalCodeUpdate)
        date = findViewById(R.id.fechaUpdate)
        ditpach = findViewById(R.id.dispatchNoteUpdate)
        type = findViewById(R.id.typeUpdate)
        dept = findViewById(R.id.deptUpdate)
        reason = findViewById(R.id.reasonCallUpdate)
    }
}