package com.example.signinsignupscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class signUpScreenLL : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_screen_ll)
        val signIn = findViewById<TextView>(R.id.tvSignIn)
        signIn.setOnClickListener {
            val intent = Intent(this, SignInScreenLL::class.java)
            startActivity(intent)
        }

    }
}