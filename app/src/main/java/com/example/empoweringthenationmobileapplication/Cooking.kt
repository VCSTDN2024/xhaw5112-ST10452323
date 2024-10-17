package com.example.empoweringthenationmobileapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Cooking : AppCompatActivity() {

    private lateinit var imageViewAccountCooking: ImageView
    private lateinit var imageViewBackCooking: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cooking)

        imageViewAccountCooking = findViewById(R.id.imageViewAccountCooking)

        imageViewAccountCooking.setOnClickListener {
            val intent = Intent(this, Form::class.java)
            startActivity(intent)
        }

        imageViewBackCooking = findViewById(R.id.imageViewBackCooking)

        imageViewBackCooking.setOnClickListener {
            val intent = Intent(this, SixWeekCourses::class.java)
            startActivity(intent)
        }
    }
}