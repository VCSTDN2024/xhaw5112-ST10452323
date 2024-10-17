package com.example.empoweringthenationmobileapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var imageViewAccountHomeScreen: ImageView
    private lateinit var buttonSixWeekCourses: Button
    private lateinit var buttonSixMonthCourses: Button
    private lateinit var buttonForm: Button
    private lateinit var buttonContactUs: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageViewAccountHomeScreen = findViewById(R.id.imageViewAccountHomeScreen)

        imageViewAccountHomeScreen.setOnClickListener {
            val intent = Intent(this, Form::class.java)
            startActivity(intent)
        }

        buttonSixWeekCourses = findViewById(R.id.buttonSixWeekCourses)

        buttonSixWeekCourses.setOnClickListener {
            val intent = Intent(this, SixWeekCourses::class.java)
            startActivity(intent)
        }

        buttonSixMonthCourses = findViewById(R.id.buttonSixMonthCourses)

        buttonSixMonthCourses.setOnClickListener {
            val intent = Intent(this, SixMonthCourses::class.java)
            startActivity(intent)
        }

        buttonForm = findViewById(R.id.buttonForm)

        buttonForm.setOnClickListener {
            val intent = Intent(this, Form::class.java)
            startActivity(intent)
        }

        buttonContactUs = findViewById(R.id.buttonContactUs)

        buttonContactUs.setOnClickListener {
            val intent = Intent(this, ContactUs::class.java)
            startActivity(intent)
        }
    }
}