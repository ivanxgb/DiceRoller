package me.ivaangb.diceroller

import android.graphics.drawable.Drawable
import android.widget.ImageView

class Dice(val sides: Int = 6) {
    fun rollDice(imageView: ImageView) {
        imageView.setImageResource(getRandomDiceImage())
    }

    private fun getRandomDiceImage(): Int {
        return when ((1..sides).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    fun clear(imageView: ImageView){
        imageView.setImageResource(R.drawable.empty_dice)
    }
}