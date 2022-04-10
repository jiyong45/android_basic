package com.example.android_basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun var_val(){
        //1. val 의 선언
        val value = "value"
        //value = "불변함 "  <-- Value는 값의 변경이 불가능함

        //2. var 의 선언
        var variable = "2022.04.10"
        variable = "variable 의 경우 이렇게 값의 변경이 가능하다"
        println(variable)
    }

    fun lateInit() {
        lateinit var text: String

        val result1 = 30

        text = "Result : $result1"
        println(text)

        val result2 = 50

        text = "Result : ${result1 + result2}"
        println(text)

    }


    fun by_Lazy() {
        lateinit var text: String
        val textLength: Int by lazy {
            text.length
        }

        // 대충 중간에 뭔가 했음
        text = "H43RO_Velog"
        println(textLength)
    }
}