package com.example.empoweringthenationmobileapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class GardenMaintenace : AppCompatActivity() {

    private lateinit var imageViewAccountGardenMaintenance: ImageView
    private lateinit var imageViewBackGardenMaintenance: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_garden_maintenace)

        imageViewAccountGardenMaintenance = findViewById(R.id.imageViewAccountGardenMaintenance)

        imageViewAccountGardenMaintenance.setOnClickListener {
            val intent = Intent(this, Form::class.java)
            startActivity(intent)
        }

        imageViewBackGardenMaintenance = findViewById(R.id.imageViewBackGardenMaintenance)

        imageViewBackGardenMaintenance.setOnClickListener {
            val intent = Intent(this, SixWeekCourses::class.java)
            startActivity(intent)
        }
    }
}