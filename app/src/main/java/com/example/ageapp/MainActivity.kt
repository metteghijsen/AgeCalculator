package com.example.ageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onSubmit(view: View){
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val ageText = findViewById<TextView>(R.id.tvAge)

        val inputYear = findViewById<EditText>(R.id.textBirthYear)
        val userAge = (currentYear - inputYear.text.toString().toInt())

        ageText.text = "Age: $userAge"
    }
}