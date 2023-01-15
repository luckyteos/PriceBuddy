package com.example.pricebuddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TeamInfo1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.team_info_1)

        val btn1: Button = findViewById(R.id.backBtn1)
        btn1.setOnClickListener{
            var i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
    }
}