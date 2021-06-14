package com.example.photobooth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btn1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()
        onClick()
    }
    fun castView(){
        btn1=findViewById(R.id.btn1)

    }
    fun onClick(){
        btn1.setOnClickListener {
            var intent=Intent(baseContext,Page2::class.java)
            startActivity(intent)
        }

    }


}