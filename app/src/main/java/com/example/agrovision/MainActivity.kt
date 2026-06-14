package com.example.agrovision // Replace with your actual package name

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // If you want to manipulate the TextView in your code,
        // you'll need to give it an ID in your XML first (e.g., android:id="@+id/myTextView")
        // Then you can reference it like this:
        // val textView = findViewById<TextView>(R.id.myTextView)
        // textView.text = "Hello, CoordinatorLayout!"
    }
}