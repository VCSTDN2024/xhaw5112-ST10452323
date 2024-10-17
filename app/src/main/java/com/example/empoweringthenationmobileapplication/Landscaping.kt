package com.example.empoweringthenationmobileapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Landscaping : AppCompatActivity() {

    private lateinit var imageViewAccountLandscaping: ImageView
    private lateinit var imageViewBackLandscaping: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landscaping)

        imageViewAccountLandscaping = findViewById(R.id.imageViewAccountLandscaping)

        imageViewAccountLandscaping.setOnClickListener {
            val intent = Intent(this, Form::class.java)
            startActivity(intent)
        }

        imageViewBackLandscaping = findViewById(R.id.imageViewBackLandscaping)

        imageViewBackLandscaping.setOnClickListener {
            val intent = Intent(this, SixMonthCourses::class.java)
            startActivity(intent)
        }
    }
}