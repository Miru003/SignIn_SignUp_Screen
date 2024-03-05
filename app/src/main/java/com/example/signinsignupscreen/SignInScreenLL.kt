package com.example.signinsignupscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SignInScreenLL : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_screen_ll)
        val signUp = findViewById<TextView>(R.id.tvSignUp)
        signUp.setOnClickListener {
            val  intent = Intent(this,signUpScreenLL::class.java)
            startActivity(intent)
        }
    }
}