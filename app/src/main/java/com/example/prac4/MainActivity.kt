package com.example.prac4

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val boxOneText = findViewById<TextView>(R.id.boxOne)
        val boxTwoText: TextView = findViewById(R.id.boxTwo)
        val boxThreeText = findViewById<TextView>(R.id.boxThree)
        val boxFourText = findViewById<TextView>(R.id.boxFour)
        val boxFiveText = findViewById<TextView>(R.id.boxFive)
        val redButton = findViewById<Button>(R.id.red_button)
        val yellowButton = findViewById<Button>(R.id.yellow_button)
        val greenButton = findViewById<Button>(R.id.green_button)

        val clickableView: List<View> =
            listOf(
                boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText, redButton, yellowButton, greenButton
            )

        for (item in clickableView) {
            item.setOnClickListener { makeColoured(it) }
        }
    }

    private fun makeColoured(view: View) {

        when(view.id) {
            R.id.boxOne -> view.setBackgroundColor(Color.BLUE)
            R.id.boxTwo -> view.setBackgroundColor(Color.GREEN)
            R.id.boxThree -> view.setBackgroundColor(Color.CYAN)
            R.id.boxFour -> view.setBackgroundColor(Color.MAGENTA)
            R.id.boxFive -> view.setBackgroundColor(Color.YELLOW)
            R.id.red_button-> view.setBackgroundColor(Color.RED)
            R.id.yellow_button-> view.setBackgroundColor(Color.YELLOW)
            R.id.green_button-> view.setBackgroundColor(Color.GREEN)
            else -> view.setBackgroundColor(Color.GRAY)
        }
    }
}