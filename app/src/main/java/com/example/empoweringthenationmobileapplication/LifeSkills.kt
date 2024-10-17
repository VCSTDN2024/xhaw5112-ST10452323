package com.example.empoweringthenationmobileapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class LifeSkills : AppCompatActivity() {

    private lateinit var imageViewAccountLifeSkills: ImageView
    private lateinit var imageViewBackLifeSkills: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_skills)

        imageViewAccountLifeSkills = findViewById(R.id.imageViewAccountLifeSkills)

        imageViewAccountLifeSkills.setOnClickListener {
            val intent = Intent(this, Form::class.java)
            startActivity(intent)
        }

        imageViewBackLifeSkills = findViewById(R.id.imageViewBackLifeSkills)

        imageViewBackLifeSkills.setOnClickListener {
            val intent = Intent(this, SixMonthCourses::class.java)
            startActivity(intent)
        }
    }
}