package com.example.test.Test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast
import com.example.test.AdhdResult.AdhdResult1
import com.example.test.AdhdResult.AdhdResult2
import com.example.test.AdhdResult.AdhdResult3
import com.example.test.R

class AdhdTest : AppCompatActivity() {

    var score =0
    var score_array: MutableList<Int> = mutableListOf(0,0,0,0,0,0,0,0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adhd_test)

        //1번
        var question1 = findViewById<RadioGroup>(R.id.answer1)
        question1.setOnCheckedChangeListener { group, checkedId ->
            score_array[0] = 0
            if(checkedId == R.id.answer1a) {
                score_array[0] = 1
            }
            if(checkedId == R.id.answer1b) {
                score_array[0] = 0
            }
        }

        //2번
        var question2 = findViewById<RadioGroup>(R.id.answer2)
        question2.setOnCheckedChangeListener { group, checkedId ->
            if(checkedId == R.id.answer2a) {
                score_array[1] = 1
            }
            if(checkedId == R.id.answer2b) {
                score_array[1] = 0
            }

        }

        //3번
        var question3 = findViewById<RadioGroup>(R.id.answer3)
        question3.setOnCheckedChangeListener { group, checkedId ->
            if(checkedId == R.id.answer3a) {
                score_array[2] = 1
            }
            if(checkedId == R.id.answer3b) {
                score_array[2] = 0
            }

        }

        //4번
        var question4 = findViewById<RadioGroup>(R.id.answer4)
        question4.setOnCheckedChangeListener { group, checkedId ->
            if(checkedId == R.id.answer4a) {
                score_array[3] = 1
            }
            if(checkedId == R.id.answer4b) {
                score_array[3] = 0
            }
        }

        //5번
        var question5 = findViewById<RadioGroup>(R.id.answer5)
        question5.setOnCheckedChangeListener { group, checkedId ->
            if(checkedId == R.id.answer5a) {
                score_array[4] = 1
            }
            if(checkedId == R.id.answer5b) {
                score_array[4] = 0
            }

        }

        var question6 = findViewById<RadioGroup>(R.id.answer6)
        question5.setOnCheckedChangeListener { group, checkedId ->
            if(checkedId == R.id.answer6a) {
                score_array[5] = 1
            }
            if(checkedId == R.id.answer6b) {
                score_array[5] = 0
            }

        }

        var question7 = findViewById<RadioGroup>(R.id.answer7)
        question5.setOnCheckedChangeListener { group, checkedId ->
            if(checkedId == R.id.answer7a) {
                score_array[6] = 1
            }
            if(checkedId == R.id.answer7b) {
                score_array[6] = 0
            }

        }

        var question8 = findViewById<RadioGroup>(R.id.answer8)
        question5.setOnCheckedChangeListener { group, checkedId ->
            if(checkedId == R.id.answer8a) {
                score_array[7] = 1
            }
            if(checkedId == R.id.answer8b) {
                score_array[7] = 0
            }

        }

        val result = findViewById<Button>(R.id.result)
        result.setOnClickListener() {

            //버튼이 하나도 눌리지 않았을 때 else로 빠지게 설정 실패 ㅅㅂ
            if ((question1.checkedRadioButtonId != -1) && (question2.checkedRadioButtonId != -1) && (question3.checkedRadioButtonId != -1) && (question4.checkedRadioButtonId != -1) && (question5.checkedRadioButtonId != -1)
                && (question6.checkedRadioButtonId != -1) && (question7.checkedRadioButtonId != -1) && (question8.checkedRadioButtonId != -1))

            {

                for( i in 0..7){
                    score += score_array[i]
                }
                //점수 0이상 3이하 1번결과창
                if(score >= 0 && score <= 3) {
                    var intent = Intent(this, AdhdResult1::class.java)
                    startActivity(intent)
                }
                //점수 4이상 6이하 2번결과창
                else if(score >= 4 && score <= 6) {
                    var intent = Intent(this, AdhdResult2::class.java)
                    startActivity(intent)
                }
                //점수 7이상 8이하 3번결과창
                else if(score >= 7 && score <= 8) {
                    var intent = Intent(this, AdhdResult3::class.java)
                    startActivity(intent)

                } else {
                    Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show()
                }
            }

            else {
                Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
