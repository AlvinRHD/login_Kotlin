package com.example.materialdesing

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class pagenextlogin : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pagenextlogin)

        val pagenextlogin = findViewById<TextView>(R.id.welcomeMessage)
        pagenextlogin.text = "Bienvenido a la app"
    }
}