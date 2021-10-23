package com.example.diwaligreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onbuttonclicked(view: View) {
        val edu : EditText = findViewById(R.id.editTextTextPersonName)
        val name = edu.editableText.toString()
        val intent = Intent(this, MainActivity3::class.java).apply {
            putExtra("name",name)
        }
        startActivity(intent)
    }
}