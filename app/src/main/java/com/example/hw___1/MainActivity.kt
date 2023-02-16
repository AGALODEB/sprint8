package com.example.hw___1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button1)

        fun navigeteTo(clazz: Class<out AppCompatActivity>) {
            val intent = Intent(this, clazz)
            startActivity(intent)
        }

        button1.setOnClickListener {
            navigeteTo(Search::class.java)
        }


        val button2 = findViewById<Button>(R.id.button2)

        button2.setOnClickListener {
            navigeteTo(Media::class.java)
        }

        val button3 = findViewById<Button>(R.id.button3)

        button3.setOnClickListener {
            navigeteTo(SettingsActivity::class.java)
        }
    }
}