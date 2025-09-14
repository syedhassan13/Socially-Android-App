package com.hassan.i230519

import android.content.Intent
import android.graphics.Camera
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SearchProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_search_profile)

        var back= findViewById<ImageView>(R.id.back)
        back.setOnClickListener {
            finish()
        }
        var gotoMessage= findViewById<RelativeLayout>(R.id.gotoMessage)



        back.setOnClickListener {
            finish()
        }
        gotoMessage.setOnClickListener {
            val intent = Intent(this, ChattingScreen::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}