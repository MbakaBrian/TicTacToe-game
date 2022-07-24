package com.example.tictactoegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var ButtonStart:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ButtonStart=findViewById(R.id.btn_start)

        ButtonStart.setOnClickListener {
            val intent = Intent(this,Game_activity::class.java)
            startActivity(intent)
        }

    }
}