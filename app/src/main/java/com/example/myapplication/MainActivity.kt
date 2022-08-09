package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onButtonClick(view: View) {
        Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()

        val intent = Intent(this@MainActivity, SecondActivity::class.java)
        startActivity(intent)
    }
}