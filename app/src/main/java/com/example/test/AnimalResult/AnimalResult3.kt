package com.example.test.AnimalResult

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.test.MainActivity
import com.example.test.R

class AnimalResult3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_result3)

        val button = findViewById<Button>(R.id.toMain)
        button.setOnClickListener(){
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
