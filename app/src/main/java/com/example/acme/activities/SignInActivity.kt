package com.example.acme.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.acme.R
import com.example.acme.data.db.DatabaseACME
import com.example.acme.data.db.model.User
import com.example.acme.data.repository.UserRepository
import com.example.acme.data.viewModel.UserViewModel
import com.example.acme.data.viewModel.UserViewModelFactory
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SignInActivity : AppCompatActivity() {

    private lateinit var viewModel: UserViewModel
    private lateinit var userDataBase: DatabaseACME
    private lateinit var repository: UserRepository
    private lateinit var factory: UserViewModelFactory

    private lateinit var singUp: TextView
    private lateinit var userName: EditText
    private lateinit var userPass: EditText
    private lateinit var signIn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        userDataBase = DatabaseACME.getDatabase(this)
        repository = UserRepository(userDataBase)
        factory = UserViewModelFactory(repository)
        viewModel = ViewModelProvider(this, factory)[UserViewModel::class.java]

        initView()

        signIn.setOnClickListener {
            login()
        }
    }

    fun login() {
        val us = userName.text.toString()
        val pass = userPass.text.toString()
        var userFind: User? = null

        if (us == "" || pass == "") {
            Toast.makeText(this, "Please enter requeried field", Toast.LENGTH_SHORT).show()
        } else {
            viewModel.getAllUser().observe(this, Observer { user ->
                user.map {
                    if (it.userName == us){
                        userFind = it
                    }
                }
                if (userFind == null) {
                    Toast.makeText(this, "User do not exist", Toast.LENGTH_SHORT).show()
                } else {
                    if (userFind!!.userName == us && userFind!!.password == pass) {
                        val sharedPreference =  getSharedPreferences("PREFERENCE_NAME", Context.MODE_PRIVATE)
                        val editor = sharedPreference.edit()
                        editor.putInt("id",userFind!!.id!!)
                        editor.apply()
                        finish()
                        startActivity(Intent(this, MainActivity::class.java))
                    } else {
                        Toast.makeText(this, "User or password wrong", Toast.LENGTH_SHORT).show()
                    }
                }
            })
        }
    }

    private fun initView() {
        userName = findViewById(R.id.userEditText)
        userPass = findViewById(R.id.passwordEditText)
        signIn = findViewById(R.id.signInAppCompatButton)
    }
}