package com.hassan.i230519

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import de.hdodenhof.circleimageview.CircleImageView

class OtherProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_other_profile)

        var back= findViewById<ImageView>(R.id.back)
        var home= findViewById<ImageView>(R.id.home)
        var search= findViewById<ImageView>(R.id.search)
        var create= findViewById<ImageView>(R.id.create)
        var like= findViewById<ImageView>(R.id.like)
        var dp= findViewById<CircleImageView>(R.id.dp)


        back.setOnClickListener {
            finish()
        }

        search.setOnClickListener {
            val intent = Intent(this, SearchGrid::class.java)
            startActivity(intent)
        }
        create.setOnClickListener {
            val intent = Intent(this, CreateScreen::class.java)
            startActivity(intent)
        }
        like.setOnClickListener {
            val intent = Intent(this, HeartFollowingScreen::class.java)
            startActivity(intent)
        }
        home.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}