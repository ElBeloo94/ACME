package com.example.acme.activities

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.location.Geocoder
import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.acme.R
import com.example.acme.data.db.DatabaseACME
import com.example.acme.data.repository.ServiceRepository
import com.example.acme.data.viewModel.ServiceViewModel
import com.example.acme.data.viewModel.ServiceViewModelFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.*

class OverviewFragment : Fragment() {

    private lateinit var map: Button
    private lateinit var viewModel: ServiceViewModel
    private lateinit var ServiceDataBase: DatabaseACME
    private lateinit var repository: ServiceRepository
    private lateinit var factory: ServiceViewModelFactory

    private lateinit var name: TextView
    private lateinit var phone: TextView
    private lateinit var adress: TextView

    //    private lateinit var city: TextView
//    private lateinit var country: TextView
//    private lateinit var postalCode: TextView
    private lateinit var date: TextView
    private lateinit var ditpach: TextView
    private lateinit var type: TextView
    private lateinit var dept: TextView
    private lateinit var reason: TextView
    private lateinit var ticket: TextView
    private lateinit var back: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_overview, container, false)
        map = view.findViewById(R.id.mapsG)
        name = view.findViewById(R.id.name)
        phone = view.findViewById(R.id.phone)
        adress = view.findViewById(R.id.adress)
//        city = view.findViewById(R.id.cityTicket)
//        country= view.findViewById(R.id.country)
//        postalCode = view.findViewById(R.id.postalCode)
        date = view.findViewById(R.id.fecha)
        ditpach = view.findViewById(R.id.dispatchNote)
        type = view.findViewById(R.id.service)
        dept = view.findViewById(R.id.dept)
        reason = view.findViewById(R.id.list_reason)
        ticket = view.findViewById(R.id.ticket)
        back = view.findViewById(R.id.back_dashboard)

        map.setOnClickListener {
            val sharedPreference =  this@OverviewFragment.requireActivity().getSharedPreferences("PREFERENCE_NAME", Context.MODE_PRIVATE)
            val editor = sharedPreference.edit()
            editor.putString("adrees", adress.text.toString())
            editor.apply()
            val intent = Intent(this.requireActivity(), GoogleMaps::class.java)
            startActivity(intent)
        }
        val sharedPreference =
            this.requireActivity().getSharedPreferences("PREFERENCE_NAME", Context.MODE_PRIVATE)
        val id = sharedPreference.getInt("idService", 0)
        //val idUser = sharedPreference.getInt("id", 0)

        ServiceDataBase = DatabaseACME.getDatabase(this.requireActivity())
        repository = ServiceRepository(ServiceDataBase)
        factory = ServiceViewModelFactory(repository)
        viewModel = ViewModelProvider(this, factory)[ServiceViewModel::class.java]

        name.text = sharedPreference.getString("name", "")
        phone.text = sharedPreference.getString("phone", "")
        val street = sharedPreference.getString("street", "")
        val city = sharedPreference.getString("city", "")
        val country = sharedPreference.getString("country", "")
        val postalCode = sharedPreference.getString("postalCode", "")
        var addressComplet = "$street, $city, $country, $postalCode."
        adress.text = addressComplet
        date.text = sharedPreference.getString("date", "")
        ditpach.text = sharedPreference.getString("dispatchNote", "")
        type.text = sharedPreference.getString("serviceType", "")
        dept.text = sharedPreference.getString("department", "")
        reason.text = sharedPreference.getString("reason", "")
        ticket.text = id.toString()

        back.setOnClickListener {
            var intent = Intent(this.requireActivity(), MainActivity::class.java)
            this.requireActivity().finish()
            startActivity(intent)
        }

        val menu = view.findViewById<ImageView>(R.id.menu_image)
        val showPopUp = PopupMenu(
            requireActivity(),
            menu
        )
        showPopUp.menu.add(Menu.NONE, 1, 1, "Get Map")
        showPopUp.menu.add(Menu.NONE, 2, 2, "Back Dashboard")

        showPopUp.setOnMenuItemClickListener { menuItem ->
            val id = menuItem.itemId
            if (id == 1) {
                val intent = Intent(requireActivity(), GoogleMaps::class.java)
                startActivity(intent)
            } else if (id == 2) {
                requireActivity().finish()
                val intent = Intent(requireActivity(), MainActivity::class.java)
                startActivity(intent)
            }
            false
        }
        menu.setOnClickListener {
            showPopUp.show()
        }

        return view
    }

    //Pressed return button - returns to the results menu
    override fun onResume() {
        super.onResume()
        requireView().isFocusableInTouchMode = true
        requireView().requestFocus()
        requireView().setOnKeyListener(fun(_: View, keyCode: Int, event: KeyEvent): Boolean {
            return if (event.action === KeyEvent.ACTION_UP && keyCode == KeyEvent.KEYCODE_BACK) {
                requireActivity().finish()
                val intent = Intent(requireActivity(), MainActivity::class.java)
                startActivity(intent)
                //your code
                true
            } else false
        })
    }
}