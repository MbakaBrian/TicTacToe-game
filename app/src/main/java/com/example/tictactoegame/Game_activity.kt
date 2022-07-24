package com.example.tictactoegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_game.*

class Game_activity : AppCompatActivity() {
    lateinit var Player1score:EditText
    lateinit var Player2score:EditText

    var Player="p1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        Player1score=findViewById(R.id.player1_score)
        Player2score=findViewById(R.id.player2_score)

        Player1score.isClickable=false
        Player2score.isClickable=false

        var Player1counts=0
        var Player2counts=0


        btn_1.setOnClickListener {
        ButtonCLick(btn_1)
        }
        btn_2.setOnClickListener {
            ButtonCLick(btn_2)
        }
        btn_3.setOnClickListener {
            ButtonCLick(btn_3)
        }
        btn_4.setOnClickListener {
            ButtonCLick(btn_4)
        }
        btn_5.setOnClickListener {
            ButtonCLick(btn_5)
        }
        btn_6.setOnClickListener {
            ButtonCLick(btn_6)
        }
        btn_7.setOnClickListener {
            ButtonCLick(btn_7)
        }
        btn_8.setOnClickListener {
            ButtonCLick(btn_8)
        }
        btn_9.setOnClickListener {
            ButtonCLick(btn_9)
        }
        btn_reset.setOnClickListener {
        reset()
        }
    }

    fun ButtonCLick( btn:Button){
        if (btn.text==""){
            if (Player=="p1") {
                btn.text = "X"
                Player="p2"
            }else{
                btn.text="O"
                Player="p1"
            }
        }
        win()
    }

    fun reset(){
        btn_1.text=""
        btn_2.text=""
        btn_3.text=""
        btn_4.text=""
        btn_5.text=""
        btn_6.text=""
        btn_7.text=""
        btn_8.text=""
        btn_9.text=""

        btn_1.isEnabled= true
        btn_2.isEnabled= true
        btn_3.isEnabled= true
        btn_4.isEnabled= true
        btn_5.isEnabled= true
        btn_6.isEnabled= true
        btn_7.isEnabled= true
        btn_8.isEnabled= true
        btn_9.isEnabled= true

    }

    fun Dissableafterwin(){
        btn_1.isEnabled= false
        btn_2.isEnabled= false
        btn_3.isEnabled= false
        btn_4.isEnabled= false
        btn_5.isEnabled= false
        btn_6.isEnabled= false
        btn_7.isEnabled= false
        btn_8.isEnabled= false
        btn_9.isEnabled= false
    }

    fun win(){

        if (( btn_1.text=="X" && btn_2.text=="X" && btn_3.text=="X" ) ||
            ( btn_4.text=="X" && btn_5.text=="X" && btn_6.text=="X" ) ||
            ( btn_7.text=="X" && btn_8.text=="X" && btn_9.text=="X" ) ||
            ( btn_1.text=="X" && btn_4.text=="X" && btn_7.text=="X" ) ||
            ( btn_2.text=="X" && btn_5.text=="X" && btn_8.text=="X" ) ||
            ( btn_3.text=="X" && btn_6.text=="X" && btn_9.text=="X" ) ||
            ( btn_1.text=="X" && btn_5.text=="X" && btn_9.text=="X" ) ||
            ( btn_3.text=="X" && btn_5.text=="X" && btn_7.text=="X" )
        ){
            toast("Player 1 wins the game")
            Dissableafterwin()
        }
        else if (( btn_1.text=="O" && btn_2.text=="O" && btn_3.text=="O" ) ||
            ( btn_4.text=="O" && btn_5.text=="O" && btn_6.text=="O" ) ||
            ( btn_7.text=="O" && btn_8.text=="O" && btn_9.text=="O" ) ||
            ( btn_1.text=="O" && btn_4.text=="O" && btn_7.text=="O" ) ||
            ( btn_2.text=="O" && btn_5.text=="O" && btn_8.text=="O" ) ||
            ( btn_3.text=="O" && btn_6.text=="O" && btn_9.text=="O" ) ||
            ( btn_1.text=="O" && btn_5.text=="O" && btn_9.text=="O" ) ||
            ( btn_3.text=="O" && btn_5.text=="O" && btn_7.text=="O" )
        ) {
            toast("Player 2 wins the game")
            Dissableafterwin()
        }
        else{
            if (btn_1.text != "" && btn_2.text != "" && btn_3.text != "" && btn_4.text != "" && btn_5.text != ""
                && btn_6.text != "" && btn_7.text != "" && btn_8.text != "" && btn_9.text != "")
            toast("The game is a draw..try again")
        }
    }

    fun toast(message:String){
        Toast.makeText(this@Game_activity,message,Toast.LENGTH_LONG).show()
    }


}