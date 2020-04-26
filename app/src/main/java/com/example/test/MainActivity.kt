package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val testBtn1 = findViewById<View>(R.id.test_btn1)
        val testBtn2 = findViewById<View>(R.id.test_btn2)
        val testBtn3 = findViewById<View>(R.id.test_btn3)

        testBtn1.setOnClickListener {
            val intent = Intent(this, AdhdStart::class.java)
            startActivity(intent)
        }
        testBtn3.setOnClickListener{
            val intent = Intent(this, AnimalStart::class.java)
            startActivity(intent)
        }

    }


}
