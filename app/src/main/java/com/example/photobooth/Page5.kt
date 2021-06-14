package com.example.photobooth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page5 : AppCompatActivity() {
    lateinit var btn8: Button
    lateinit var btn9: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page5)
        castViews()
        onclick()
    }

    fun castViews() {
        btn8 = findViewById(R.id.btn8)

    }

    fun onclick() {
        btn8.setOnClickListener {
            var intent = Intent(baseContext, Page4::class.java)
            startActivity(intent)
        }
        btn8.setOnClickListener {
            var intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }

    }
}