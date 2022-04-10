package com.example.android_basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //1. val 의 선언
        val value = "value"
        //value = "불변함 "  <-- Value는 값의 변경이 불가능함

        //2. var 의 선언
        var variable = "2022.04.10"
        variable = "variable 의 경우 이렇게 값의 변경이 가능하다"






    }
}