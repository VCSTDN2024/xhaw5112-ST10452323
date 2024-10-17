package com.example.empoweringthenationmobileapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Sewing : AppCompatActivity() {

    private lateinit var imageViewAccountSewing: ImageView
    private lateinit var imageViewBackSewing: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sewing)

        imageViewAccountSewing = findViewById(R.id.imageViewAccountSewing)

        imageViewAccountSewing.setOnClickListener {
            val intent = Intent(this, Form::class.java)
            startActivity(intent)
        }

        imageViewBackSewing = findViewById(R.id.imageViewBackSewing)

        imageViewBackSewing.setOnClickListener {
            val intent = Intent(this, SixMonthCourses::class.java)
            startActivity(intent)
        }
    }
}