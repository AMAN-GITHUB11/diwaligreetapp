package com.example.diwaligreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val name = intent.getStringExtra("name")
        val epu : TextView = findViewById(R.id.textView)
        epu.text = "HAPPY DIWALI $name"
    }
}