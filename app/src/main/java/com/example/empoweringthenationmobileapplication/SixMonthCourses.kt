package com.example.empoweringthenationmobileapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class SixMonthCourses : AppCompatActivity() {

    private lateinit var textViewAccountSixMonthCourses: ImageView
    private lateinit var imageViewBackSixMonthCourses: ImageView
    private lateinit var buttonFirstAid: Button
    private lateinit var buttonSewing: Button
    private lateinit var buttonLandscaping: Button
    private lateinit var buttonLifeSkills: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_month_courses)

        textViewAccountSixMonthCourses = findViewById(R.id.textViewAccountSixMonthCourses)

        textViewAccountSixMonthCourses.setOnClickListener {
            val intent = Intent(this, Form::class.java)
            startActivity(intent)
        }

        imageViewBackSixMonthCourses = findViewById(R.id.imageViewBackSixMonthCourses)

        imageViewBackSixMonthCourses.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        buttonFirstAid = findViewById(R.id.buttonFirstAid)

        buttonFirstAid.setOnClickListener {
            val intent = Intent(this, FirstAid::class.java)
            startActivity(intent)
        }

        buttonSewing = findViewById(R.id.buttonSewing)

        buttonSewing.setOnClickListener {
            val intent = Intent(this, Sewing::class.java)
            startActivity(intent)
        }

        buttonLandscaping = findViewById(R.id.buttonLandscaping)

        buttonLandscaping.setOnClickListener {
            val intent = Intent(this, Landscaping::class.java)
            startActivity(intent)
        }

        buttonLifeSkills = findViewById(R.id.buttonLifeSkills)

        buttonLifeSkills.setOnClickListener {
            val intent = Intent(this, LifeSkills::class.java)
            startActivity(intent)
        }
    }
}