package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputText = findViewById<EditText>(R.id.edText)
        val outputText = findViewById<TextView>(R.id.tvText)
        val button = findViewById<Button>(R.id.btn)
        var input = inputText.text
        button.setOnClickListener{
            outputText.text = "Welcome $input to HNG, hope you make the most of it."
        }


    }
}