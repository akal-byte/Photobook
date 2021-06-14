package com.example.photobooth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page4 : AppCompatActivity() {
    lateinit var btn6:Button
    lateinit var btn7:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page4)
        castViews()
        onClick()
    }
    fun castViews(){
        btn6=findViewById(R.id.btn6)
        btn7=findViewById(R.id.btn7)
    }
    fun onClick(){
        btn6.setOnClickListener {
            var intent=Intent(baseContext,Page3::class.java)
            startActivity(intent)
        }
        btn7.setOnClickListener {
            var intent=Intent(baseContext,Page5::class.java)
            startActivity(intent)
        }
    }

}