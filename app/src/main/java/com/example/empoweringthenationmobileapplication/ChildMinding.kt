package com.example.empoweringthenationmobileapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ChildMinding : AppCompatActivity() {

    private lateinit var imageViewAccounrChildMinding: ImageView
    private lateinit var imageViewBackChildMinding: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_minding)

        imageViewAccounrChildMinding = findViewById(R.id.imageViewAccounrChildMinding)

        imageViewAccounrChildMinding.setOnClickListener {
            val intent = Intent(this, Form::class.java)
            startActivity(intent)
        }

        imageViewBackChildMinding = findViewById(R.id.imageViewBackChildMinding)

        imageViewBackChildMinding.setOnClickListener {
            val intent = Intent(this, SixWeekCourses::class.java)
            startActivity(intent)
        }
    }
}