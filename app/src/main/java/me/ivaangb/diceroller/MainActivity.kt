package me.ivaangb.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Xml
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var firstDiceImage : ImageView
    lateinit var secondDiceImage : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButon: Button = findViewById(R.id.roll_button)
        val clearButton: Button = findViewById(R.id.clear_button)

        firstDiceImage = findViewById(R.id.first_dice)
        secondDiceImage = findViewById(R.id.second_dice)

        rollButon.setOnClickListener { rollDice() }
        clearButton.setOnClickListener { clearButton() }
    }



    private fun rollDice() {
        firstDiceImage.setImageResource(getRandomDiceImage())
        secondDiceImage.setImageResource(getRandomDiceImage())
    }

    private fun getRandomDiceImage(): Int {
        val randomInt = (1..6).random()

        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    private fun clearButton() {
        val emptyDice: Int = R.drawable.empty_dice
        firstDiceImage.setImageResource(emptyDice)
        secondDiceImage.setImageResource(emptyDice)
    }



}