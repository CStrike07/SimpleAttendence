package com.example.simpleattendence

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    supportFragmentManager.beginTransaction().add(R.id.fragmentPlaceHolder,StartPage()).commit()

    }

    fun StudentSignupPage(){
        supportFragmentManager.beginTransaction().replace(R.id.fragmentPlaceHolder,StudentSignup()).commit()

    }
}
