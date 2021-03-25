package me.ivaangb.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import me.ivaangb.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val firstDice = Dice()
    private val secondDice = Dice()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.rollButton.setOnClickListener { rollDice() }
        binding.clearButton.setOnClickListener { clearButton() }
    }

    private fun rollDice() {
        this.firstDice.rollDice(binding.firstDice)
        this.secondDice.rollDice(binding.secondDice)
    }

    private fun clearButton() {
        this.firstDice.clear(binding.firstDice)
        this.secondDice.clear(binding.secondDice)
    }
}