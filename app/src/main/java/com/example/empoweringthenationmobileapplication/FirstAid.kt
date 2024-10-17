package com.example.empoweringthenationmobileapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class FirstAid : AppCompatActivity() {

    private lateinit var imageViewAccountFirstAid: ImageView
    private lateinit var imageViewBackFirstAid: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_aid)

        imageViewAccountFirstAid = findViewById(R.id.imageViewAccountFirstAid)

        imageViewAccountFirstAid.setOnClickListener {
            val intent = Intent(this, Form::class.java)
            startActivity(intent)
        }

        imageViewBackFirstAid = findViewById(R.id.imageViewBackFirstAid)

        imageViewBackFirstAid.setOnClickListener {
            val intent = Intent(this, SixMonthCourses::class.java)
            startActivity(intent)
        }
    }
}