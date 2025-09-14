package com.hassan.i230519

import android.content.Intent
import android.os.Bundle
import android.text.Highlights
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import de.hdodenhof.circleimageview.CircleImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var home= findViewById<ImageView>(R.id.home)
        var search= findViewById<ImageView>(R.id.search)
        var create= findViewById<ImageView>(R.id.create)
        var like= findViewById<ImageView>(R.id.like)
        var dp= findViewById<CircleImageView>(R.id.dp)
        var myStory= findViewById<CircleImageView>(R.id.myStory)
        var storyCreate= findViewById<ImageView>(R.id.createStory)
        var otherStory= findViewById<CircleImageView>(R.id.otherStory)
        var highlights= findViewById<CircleImageView>(R.id.highlights)
        var i= findViewById<ImageView>(R.id.io)




        i.setOnClickListener {
            val intent = Intent(this, CameraScreen::class.java)
            startActivity(intent)
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
        dp.setOnClickListener {
            val intent = Intent(this, UserProfile::class.java)
            startActivity(intent)
        }
        myStory.setOnClickListener {
            val intent = Intent(this, StoryScreen::class.java)
            startActivity(intent)
        }
        storyCreate.setOnClickListener {
            val intent = Intent(this, StoryPost::class.java)
            startActivity(intent)
        }
        otherStory.setOnClickListener {
            val intent = Intent(this, StatusScreen::class.java)
            startActivity(intent)
        }

        highlights.setOnClickListener {
            val intent = Intent(this, HighlightScreen::class.java)
            startActivity(intent)
        }





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}