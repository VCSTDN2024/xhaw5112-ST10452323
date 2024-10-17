package com.example.empoweringthenationmobileapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class SixWeekCourses : AppCompatActivity() {

    private lateinit var imageViewAccountSixWeekCourses: ImageView
    private lateinit var imageViewBackSixWeekCourses: ImageView
    private lateinit var buttonChildMinding: Button
    private lateinit var buttonCooking: Button
    private lateinit var buttonGardenMaintenance: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_week_courses)

        imageViewAccountSixWeekCourses = findViewById(R.id.imageViewAccountSixWeekCourses)

        imageViewAccountSixWeekCourses.setOnClickListener {
            val intent = Intent(this, Form::class.java)
            startActivity(intent)
        }

        imageViewBackSixWeekCourses = findViewById(R.id.imageViewBackSixWeekCourses)

        imageViewBackSixWeekCourses.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        buttonChildMinding = findViewById(R.id.buttonChildMinding)

        buttonChildMinding.setOnClickListener {
            val intent = Intent(this, ChildMinding::class.java)
            startActivity(intent)
        }

        buttonCooking = findViewById(R.id.buttonCooking)

        buttonCooking.setOnClickListener {
            val intent = Intent(this, Cooking::class.java)
            startActivity(intent)
        }

        buttonGardenMaintenance = findViewById(R.id.buttonGardenMaintenance)

        buttonGardenMaintenance.setOnClickListener {
            val intent = Intent(this, GardenMaintenace::class.java)
            startActivity(intent)
        }
    }
}