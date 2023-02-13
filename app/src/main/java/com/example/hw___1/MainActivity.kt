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

        button1.setOnClickListener {
            val intent = Intent(this, Search::class.java)
            startActivity(intent)
        }


        val button2 = findViewById<Button>(R.id.button2)

        button2.setOnClickListener {
            val intent = Intent(this, Media::class.java)
            startActivity(intent)
        }

        val button3 = findViewById<Button>(R.id.button3)

        button3.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}