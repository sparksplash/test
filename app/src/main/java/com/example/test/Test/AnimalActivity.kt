package com.example.test.Test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast
import com.example.test.AnimalResult.AnimalResult1
import com.example.test.AnimalResult.AnimalResult2
import com.example.test.AnimalResult.AnimalResult3
import com.example.test.R

class AnimalActivity : AppCompatActivity() {

    var score = 0
    //각 문제 별 점수(배열)
    var score_array: MutableList<Int> = mutableListOf(0,0,0,0,0)
//    var score_array = arrayOf(0,1,2,3,4)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal)

/*        //각 라디오그룹 별 점수 저장을 위한 배열 초기값 0으로 설정
        for( i in 0..4){
            score_array[i] = 0
        }
*/
        //1번
        var question1 = findViewById<RadioGroup>(R.id.answer1)
        question1.setOnCheckedChangeListener { group, checkedId ->
            score_array[0] = 0
            if(checkedId == R.id.answer1a) {
                score_array[0] = 1
            }
            if(checkedId == R.id.answer1b) {
                score_array[0] = 2
            }
            if(checkedId == R.id.answer1c) {
                score_array[0] = 3
            }
            if(checkedId == R.id.answer1d) {
                score_array[0] = 4
            }
        }

        //2번
        var question2 = findViewById<RadioGroup>(R.id.answer2)
        question2.setOnCheckedChangeListener { group, checkedId ->
            if(checkedId == R.id.answer2a) {
                score_array[1] = 1
            }
            if(checkedId == R.id.answer2b) {
                score_array[1] = 2
            }
            if(checkedId == R.id.answer2c) {
                score_array[1] = 3
            }
            if(checkedId == R.id.answer2d) {
                score_array[1] = 4
            }
        }

        //3번
        var question3 = findViewById<RadioGroup>(R.id.answer3)
        question3.setOnCheckedChangeListener { group, checkedId ->
            if(checkedId == R.id.answer3a) {
                score_array[2] = 1
            }
            if(checkedId == R.id.answer3b) {
                score_array[2] = 2
            }
            if(checkedId == R.id.answer3c) {
                score_array[2] = 3
            }
            if(checkedId == R.id.answer3d) {
                score_array[2] = 4
            }
        }

        //4번
        var question4 = findViewById<RadioGroup>(R.id.answer4)
        question4.setOnCheckedChangeListener { group, checkedId ->
            if(checkedId == R.id.answer4a) {
                score_array[3] = 1
            }
            if(checkedId == R.id.answer4b) {
                score_array[3] = 2
            }
            if(checkedId == R.id.answer4c) {
                score_array[3] = 3
            }
            if(checkedId == R.id.answer4d) {
                score_array[3] = 4
            }
        }

        //5번
        var question5 = findViewById<RadioGroup>(R.id.answer5)
        question5.setOnCheckedChangeListener { group, checkedId ->
            if(checkedId == R.id.answer5a) {
                score_array[4] = 1
            }
            if(checkedId == R.id.answer5b) {
                score_array[4] = 2
            }
            if(checkedId == R.id.answer5c) {
                score_array[4] = 3
            }
            if(checkedId == R.id.answer5d) {
                score_array[4] = 4
            }
        }

        //선택 후 결과창으로 이동하는 버튼(result)
        val result = findViewById<Button>(R.id.result)
        result.setOnClickListener() {

            //버튼이 하나도 눌리지 않았을 때 else로 빠지게 설정 실패 ㅅㅂ
            if ((question1.checkedRadioButtonId != -1) && (question2.checkedRadioButtonId != -1) && (question3.checkedRadioButtonId != -1) && (question4.checkedRadioButtonId != -1) && (question5.checkedRadioButtonId != -1)) {
                for( i in 0..4){
                    score += score_array[i]
                }
                //점수 5이상 10이하 1번결과창 - 강아지
                if(score >= 5 && score <= 10) {
                    var intent = Intent(this, AnimalResult1::class.java)
                    startActivity(intent)
                }
                //점수 10초과 15이하 2번결과창 - 고양이
                else if(score > 10 && score <= 15) {
                    var intent = Intent(this, AnimalResult2::class.java)
                    startActivity(intent)
                }
                //점수 15이상 20이하 3번결과창 - 호랑이
                else if(score > 15 && score <= 20) {
                    var intent = Intent(this, AnimalResult3::class.java)
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
