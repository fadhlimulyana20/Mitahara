package com.kelompok5.mitahara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class reset_password : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)

        val button = findViewById<Button>(R.id.reset_pass_button)
        button.setOnClickListener{
            val intent = Intent(this, reset_pass_verif::class.java)
            startActivity(intent)
        }
    }
}


