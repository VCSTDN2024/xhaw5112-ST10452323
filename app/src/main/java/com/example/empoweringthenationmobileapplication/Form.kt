package com.example.empoweringthenationmobileapplication

import android.content.Intent
import android.os.Bundle
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.net.Uri
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Form : AppCompatActivity() {

    private lateinit var imageViewBackForm: ImageView
    private lateinit var editTexTextName: EditText
    private lateinit var editTextPhonePhoneNumber: EditText
    private lateinit var editTextTextEmailAddress: EditText
    private lateinit var checkBoxChildMinding: CheckBox
    private lateinit var checkBoxCooking: CheckBox
    private lateinit var checkBoxGardenMaintenance: CheckBox
    private lateinit var checkBoxFirstAid: CheckBox
    private lateinit var checkBoxSewing: CheckBox
    private lateinit var checkBoxLandscaping: CheckBox
    private lateinit var checkBoxLifeSkills: CheckBox
    private lateinit var buttonQuote: Button
    private lateinit var buttonConsult: Button

    private var selectedCourseCount = 0
    private var discount = 0.0
    private var totalPrice = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        imageViewBackForm = findViewById(R.id.imageViewBackForm)
        editTexTextName = findViewById(R.id.editTexTextName)
        editTextPhonePhoneNumber = findViewById(R.id.editTextPhonePhoneNumber)
        editTextTextEmailAddress = findViewById(R.id.editTextTextEmailAddress)
        checkBoxChildMinding = findViewById(R.id.checkBoxChildMinding)
        checkBoxCooking = findViewById(R.id.checkBoxCooking)
        checkBoxGardenMaintenance = findViewById(R.id.checkBoxGardenMaintenace)
        checkBoxFirstAid = findViewById(R.id.checkBoxFirstAid)
        checkBoxSewing = findViewById(R.id.checkBoxSewing)
        checkBoxLandscaping = findViewById(R.id.checkBoxLandscaping)
        checkBoxLifeSkills = findViewById(R.id.checkBoxLifeSkills)
        buttonQuote = findViewById(R.id.buttonQuote)
        buttonConsult = findViewById(R.id.buttonConsult)

        imageViewBackForm.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        setUpCheckbox(checkBoxChildMinding, 750.0)
        setUpCheckbox(checkBoxCooking, 750.0)
        setUpCheckbox(checkBoxGardenMaintenance, 750.0)
        setUpCheckbox(checkBoxFirstAid, 1500.0)
        setUpCheckbox(checkBoxSewing, 1500.0)
        setUpCheckbox(checkBoxLandscaping, 1500.0)
        setUpCheckbox(checkBoxLifeSkills, 1500.0)

        buttonQuote.setOnClickListener {
            val name = editTexTextName.text.toString().trim()
            val number = editTextPhonePhoneNumber.text.toString().trim()
            val email = editTextTextEmailAddress.text.toString().trim()

            if (name.isEmpty() || number.isEmpty() || email.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(Intent.ACTION_SENDTO).apply {
                    data = Uri.parse("mailto:")
                    putExtra(Intent.EXTRA_SUBJECT, "Quote Request")
                    putExtra(
                        Intent.EXTRA_TEXT,
                        "Name: $name\nPhone: $number\nEmail: $email\nTotal Price: R$totalPrice"
                    )
                }
                try {
                    startActivity(Intent.createChooser(intent, "Send Email"))
                } catch (e: Exception) {
                    Toast.makeText(this, "No email app available", Toast.LENGTH_SHORT).show()
                }
            }
        }

        buttonConsult.setOnClickListener {
            Toast.makeText(
                this,
                "One of our consultants will contact you soon!",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun setUpCheckbox(checkbox: CheckBox, coursePrice: Double) {
        checkbox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                selectedCourseCount++
                totalPrice += coursePrice
            } else {
                selectedCourseCount--
                totalPrice -= coursePrice
            }
            updateDiscountAndPrice()
        }
    }

    private fun updateDiscountAndPrice() {
        discount = when (selectedCourseCount) {
            1 -> 0.0
            2 -> 0.05
            3 -> 0.10
            else -> 0.15
        }

        val discountAmount = totalPrice * discount
        val discountedPrice = totalPrice - discountAmount

        val vat = discountedPrice * 0.15

        val finalPriceWithVAT = discountedPrice + vat

        Toast.makeText(
            this,
            "Original Price: R$totalPrice\nDiscount: R$discountAmount\nVAT (15%): R$vat\nTotal Price (including VAT and discount): R$finalPriceWithVAT",
            Toast.LENGTH_LONG
        ).show()
    }
}
