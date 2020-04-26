package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.test.Test.AdhdTest
import com.example.test.Test.AnimalActivity

class AdhdStart : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adhd_start)

        val startBtn = findViewById<Button>(R.id.startbutton)
        val explainBtn = findViewById<View>(R.id.explain)

        startBtn.setOnClickListener {
            val intent = Intent(this, AdhdTest::class.java)
            startActivity(intent)
        }
        explainBtn.setOnClickListener(){
            val intent = Intent(this, AdhdInfo::class.java )
            startActivity(intent)
        }
    }
}
