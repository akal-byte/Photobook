package com.example.photobooth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page3 : AppCompatActivity() {
    lateinit var btn4:Button
    lateinit var btn5:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)
        castView()
        onClick()
    }
    fun castView(){
        btn4=findViewById(R.id.btn4)
        btn5=findViewById(R.id.btn5)
    }
    fun onClick(){
        btn4.setOnClickListener {
            var intent=Intent(baseContext,Page2::class.java)
            startActivity(intent)
        }
        btn5.setOnClickListener {
            var intent=Intent(baseContext,Page4::class.java)
            startActivity(intent)
        }
    }

}