package com.example.theworldchangescolors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

// This Kotlin file is where we're going to be handling user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Show this layout file: activity_main
        setContentView(R.layout.activity_main)



        // User can tap a button to change the text color of the label.
        // 1. add a button to our layout

        // Get a reference to our button
        findViewById<Button>(R.id.button).setOnClickListener{

            // Handle button tap
            // 2. Change the color of the text when button is pushed by user
            Log.i("Sergio", "Tapped on button")
            // Get reference to text view
            // Set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.teal_200))
        }



    }
}