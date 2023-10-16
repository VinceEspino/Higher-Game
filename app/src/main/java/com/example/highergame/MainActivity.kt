package com.example.highergame

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.highergame.R
import kotlin.properties.Delegates
import kotlin.random.Random
import androidx.core.content.ContextCompat

class MainActivity : ComponentActivity() {
    var rand = Random.nextInt(0,20)

    private fun generateRandomNumber() {
        var randomNumber = Random()
    }

//    var rand = randomNumber.nextInt(20) + 1
    fun guess(view: View?) {
        val numberField = findViewById(R.id.numberField) as EditText
        val guessedNumber = numberField.text.toString().toInt()
        val message: String
        if (guessedNumber == rand) {
            message = "You guessed it right"
            generateRandomNumber()
        } else if (guessedNumber > rand) {
            message = "Lower!"
        } else {
            message  = "Higher!"
        }
        Toast.makeText(this, "$message", Toast.LENGTH_SHORT).show()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        generateRandomNumber()
    }
}
