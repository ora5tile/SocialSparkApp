package com.example.socialsparkapp   // Keep your own package name if it is different

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

// Main activity of the application
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Link UI components to variables
        val inputTime = findViewById<EditText>(R.id.inputTime)
        val btnShow = findViewById<Button>(R.id.btnShow)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val resultText = findViewById<TextView>(R.id.resultText)

        // Handle Show Suggestion button click
        btnShow.setOnClickListener {

            // Get user input and convert it to lowercase
            val userInput = inputTime.text.toString().trim().lowercase()

            // Check the input using if statements and display the correct message
            if (userInput.isEmpty()) {
                resultText.text = "Please enter a time of day first."
            } else if (userInput == "morning") {
                resultText.text = "Suggestion: Send a good morning message to a family member."
            } else if (userInput == "mid-morning") {
                resultText.text = "Suggestion: Send a quick thank-you message to a classmate or colleague."
            } else if (userInput == "afternoon") {
                resultText.text = "Suggestion: Share a funny meme or interesting link with a friend."
            } else if (userInput == "afternoon snack time") {
                resultText.text = "Suggestion: Send a short thinking of you message."
            } else if (userInput == "dinner") {
                resultText.text = "Suggestion: Call a friend or relative for a quick catch-up."
            } else if (userInput == "after dinner" || userInput == "night") {
                resultText.text = "Suggestion: Leave a thoughtful comment on a friend's post."
            } else {
                resultText.text = "Invalid input. Please enter morning, mid-morning, afternoon, dinner, or night."
            }
        }

        // Handle Reset button click
        btnReset.setOnClickListener {

            // Clear the input field
            inputTime.text.clear()

            // Reset the result text
            resultText.text = "Your suggestion will appear here"
        }
    }
}