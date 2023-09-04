package com.example.android.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var  resultText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice() }

        resultText = findViewById(R.id.result_text)
        resultText.text = "Dice Rolled!"
    }

    private fun rollDice() {
        val randomInt = (1..6).random()
        val resultView: ImageView = findViewById(R.id.dice_image)
        val drawableResource = when(randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        resultText.text = randomInt.toString()

        resultView.setImageResource(drawableResource)
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()

    }
}