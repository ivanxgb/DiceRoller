package me.ivaangb.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButon: Button = findViewById(R.id.roll_button)
        val countUp: Button = findViewById(R.id.countUp_Button)

        rollButon.setOnClickListener { rollDice() }
        countUp.setOnClickListener { countUp() }


    }


    private fun rollDice() {
        val randomInt = (1..6).random()
        val resulText: TextView = findViewById(R.id.result_text)

        resulText.text = randomInt.toString()
    }

    private fun countUp() {
        val resulText: TextView = findViewById(R.id.result_text)
        var counter = 1

        if (resulText.text.toString().toIntOrNull() == null) {
            resulText.text = counter.toString()
        } else {
            counter = resulText.text.toString().toInt()

            if (counter < 6) {
                counter++
                resulText.text = counter.toString()
            }
        }
    }

}