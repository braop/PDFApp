package com.example.pdfapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val englishLink: TextView = findViewById(R.id.english)
        val lusogaLink: TextView = findViewById(R.id.lusoga)

        englishLink.setOnClickListener {
            val intent = Intent(this, PfdActivity::class.java)
            intent.putExtra("page", "english")
            startActivity(intent)

        }

        lusogaLink.setOnClickListener {
            val intent = Intent(this, PfdActivity::class.java)
            intent.putExtra("page", "lusoga")
            startActivity(intent)

        }
    }
}