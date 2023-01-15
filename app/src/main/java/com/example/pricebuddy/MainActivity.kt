package com.example.pricebuddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var teamImg1 = findViewById<ImageView>(R.id.teamImg1)
        teamImg1.setOnClickListener{
            var i = Intent(this, TeamInfo1Activity::class.java)
            startActivity(i)
        }
        var teamDesc1 = findViewById<TextView>(R.id.teamDesc1)
        teamDesc1.setOnClickListener{
            var i = Intent(this, TeamInfo1Activity::class.java)
            startActivity(i)
        }
    }
}