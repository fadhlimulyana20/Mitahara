package com.kelompok5.mitahara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class reset_pass_verif : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_pass_verif)

        val button = findViewById<Button>(R.id.reset_verif_button)
        button.setOnClickListener{
            val intent = Intent(this, create_new_password::class.java)
            startActivity(intent)
        }
    }
}