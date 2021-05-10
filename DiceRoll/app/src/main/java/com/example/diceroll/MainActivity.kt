package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    //val rollButton :Button = findViewById(R.id.roll_button)
    lateinit var rollButton :Button
    //val resultTextt : TextView = findViewById(R.id.result_textview)
    //val diceImage :ImageView = findViewById(R.id.dice_image)
    lateinit var diceImage :ImageView
    final val logTag = "My Application"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rollButton = findViewById(R.id.roll_button)
        diceImage= findViewById(R.id.dice_image)
        //rollButton.text= "Let's roll"

        rollButton.setOnClickListener{
            //Toast.makeText(this,"Button clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }

    }

    private fun rollDice() {
        Log.d(logTag,"Entering rollDice")
        val randomInt =  Random.nextInt(6)+1
        //resultTextt.text = randomInt.toString()
        when(randomInt){
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
    }
}