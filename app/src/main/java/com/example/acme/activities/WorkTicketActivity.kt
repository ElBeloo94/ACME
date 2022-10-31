package com.example.acme.activities

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ImageView
import androidx.appcompat.widget.PopupMenu
import androidx.fragment.app.Fragment
import com.example.acme.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class WorkTicketActivity : AppCompatActivity() {

    lateinit var bottomNav : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_work_ticket)
        loadFragment(OverviewFragment())
        bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        bottomNav.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.overview -> {
                    loadFragment(OverviewFragment())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.work -> {
                    loadFragment(OverviewFragment())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.purchase -> {
                    loadFragment(OverviewFragment())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.finishing -> {
                    loadFragment(OverviewFragment())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.camera -> {
                    loadFragment(OverviewFragment())
                    return@setOnNavigationItemReselectedListener
                }
            }
        }

    }

    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}