package com.example.pdfapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class PfdActivity : AppCompatActivity() {

    var pdFLink: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pfd)

        pdFLink = intent.getStringExtra("page")

        if (pdFLink == "english"){
            val pdf: PDFView = findViewById(R.id.pdf)
            pdf.fromAsset("english.pdf").load()
        }
        else {
            val pdf: PDFView = findViewById(R.id.pdf)
            pdf.fromAsset("ura.pdf").load()
        }
    }
}