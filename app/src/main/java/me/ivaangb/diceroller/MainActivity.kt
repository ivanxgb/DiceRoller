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
        val resultText: TextView = findViewById(R.id.result_text)


        val rollButon: Button = findViewById(R.id.roll_button)
        val countUp: Button = findViewById(R.id.countUp_Button)
        val resetButton: Button = findViewById(R.id.reset_button)


        rollButon.setOnClickListener { rollDice(resultText) }
        countUp.setOnClickListener { countUp(resultText) }
        resetButton.setOnClickListener {reset(resultText)}
    }


    private fun rollDice(resultText: TextView) {
        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()
    }

    private fun countUp(resultText: TextView) {
        var counter = 1
        if (resultText.text.toString().toIntOrNull() == null) {
            resultText.text = counter.toString()
        } else {
            counter = resultText.text.toString().toInt()

            if (counter < 6) {
                counter++
                resultText.text = counter.toString()
            }
        }
    }

    private fun reset(resultText: TextView) {
        resultText.text = "0"
    }

}