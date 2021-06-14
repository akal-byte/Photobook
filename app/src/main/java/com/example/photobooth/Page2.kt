package com.example.photobooth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page2 : AppCompatActivity() {
    lateinit var btn2:Button
    lateinit var btn3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        castView()
        onClick()
    }
    fun castView(){
        btn2=findViewById(R.id.btn2)
        btn3=findViewById(R.id.btn3)
    }
    fun onClick(){
        btn2.setOnClickListener {
            var intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }
        btn3.setOnClickListener {
            var intent=Intent(baseContext,Page3::class.java)
            startActivity(intent)
        }
    }


}