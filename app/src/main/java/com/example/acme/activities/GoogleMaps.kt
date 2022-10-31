package com.example.acme.activities

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.location.Address
import android.location.Geocoder
import android.location.Location
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.acme.R
import com.example.acme.databinding.ActivityGoogleMapsBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.IOException
import java.util.*


@Suppress("DEPRECATION")
class GoogleMaps : AppCompatActivity(), OnMapReadyCallback,
    GoogleMap.OnMyLocationButtonClickListener, GoogleMap.OnMyLocationClickListener,
    GoogleMap.OnMapClickListener, GoogleMap.OnMapLoadedCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityGoogleMapsBinding
    private var address: Address? = null


    companion object {
        const val codeLocation = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGoogleMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        createMapFragment()


    }

    private fun createMapFragment() {
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        mMap.setOnMyLocationButtonClickListener(this)
        mMap.setOnMyLocationClickListener(this)
        enableLocation()
        mMap.setOnMapClickListener(this)
        mMap.setOnMapLoadedCallback(this)
    }

    private fun permissionLocation() = ContextCompat.checkSelfPermission(
        this,
        Manifest.permission.ACCESS_FINE_LOCATION
    ) == PackageManager.PERMISSION_GRANTED

    @SuppressLint("MissingPermission")
    private fun enableLocation() {
        if (!::mMap.isInitialized) return
        if (permissionLocation()) {
            mMap.isMyLocationEnabled = true
        } else {
            requestLocPermission()
        }
    }

    private fun requestLocPermission() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            )
        ) {
            Toast.makeText(this, "Go setting and acept permission ", Toast.LENGTH_SHORT).show()
        } else {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                codeLocation
            )
        }
    }

    @SuppressLint("MissingPermission")
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            codeLocation -> if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                mMap.isMyLocationEnabled = true
            } else {
                Toast.makeText(this, "Go setting and acept permission ", Toast.LENGTH_SHORT).show()
            }
            else -> {}
        }
    }

    @SuppressLint("MissingPermission")
    override fun onResumeFragments() {
        super.onResumeFragments()
        if (!::mMap.isInitialized) return
        if (!permissionLocation()) {
            mMap.isMyLocationEnabled = false
            Toast.makeText(this, "Go setting and acept permission ", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onMyLocationButtonClick(): Boolean {
        Toast.makeText(this, "Go ubucation", Toast.LENGTH_SHORT).show()
        return false
    }

    override fun onMyLocationClick(p0: Location) {
        CoroutineScope(Dispatchers.Main).launch {
            val geoCoder = Geocoder(this@GoogleMaps, Locale.getDefault())
            try{
                val addresses: List<Address>? = geoCoder.getFromLocation(p0.latitude, p0.longitude, 1)
                var direccionCoordenadas = "Sin Datos"
                if (addresses!!.isNotEmpty()) {
                    address = addresses[0]
                    direccionCoordenadas = (address!!.getAddressLine(0)
                            + " " + address!!.postalCode
                            + " " + address!!.locality
                            + ", " + address!!.countryName)
                }
                Toast.makeText(this@GoogleMaps, direccionCoordenadas, Toast.LENGTH_SHORT).show()
            }catch (e: IOException){
                e.printStackTrace()
            }
        }

    }

    override fun onMapClick(p0: LatLng) {
        CoroutineScope(Dispatchers.Main).launch {
            val geoCoder = Geocoder(this@GoogleMaps, Locale.getDefault())
            try {
                val addresses: List<Address>? =
                    geoCoder.getFromLocation(p0.latitude, p0.longitude, 1)
                var direccionCoordenadas = "Sin Datos"
                if (addresses!!.isNotEmpty()) {
                    address = addresses[0]
                    direccionCoordenadas = (address!!.getAddressLine(0)
                            + " " + address!!.postalCode
                            + " " + address!!.locality
                            + ", " + address!!.countryName)
                }
                Toast.makeText(this@GoogleMaps, direccionCoordenadas, Toast.LENGTH_SHORT).show()
                mMap.addMarker(MarkerOptions().position(p0).title(direccionCoordenadas))
            }catch (e: IOException){
                e.printStackTrace()
            }
        }
    }


    override fun onMapLoaded() {
        val sharedPreference = getSharedPreferences("PREFERENCE_NAME", Context.MODE_PRIVATE)
//        street = sharedPreference.getString("street", "").toString()
        val city = sharedPreference.getString("city", "").toString()
//        country = sharedPreference.getString("country", "").toString()
        //       postalCode = sharedPreference.getString("postalCode", "").toString()
        val direccionCoordenas = sharedPreference.getString("adrees", "").toString()
        CoroutineScope(Dispatchers.Main).launch {
            val geoCoder = Geocoder(this@GoogleMaps, Locale.getDefault())
            try {
                val coordinator = geoCoder.getFromLocationName(direccionCoordenas, 1)
                if (coordinator!!.isNotEmpty()) {
                    val coordenadas = LatLng(coordinator[0].latitude, coordinator[0].longitude)
                    mMap.addMarker(MarkerOptions().position(coordenadas).title(city))
                    mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(coordenadas, 19f),
                        5000,null)
                }
            }
            catch (e: IOException){
                e.printStackTrace()
            }
        }
    }
}