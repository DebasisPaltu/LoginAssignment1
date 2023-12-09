package com.example.loginassignment1.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.loginassignment1.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginbtn.setOnClickListener {
            val email = binding.emailEditText.text.toString()
            val password = binding.passwordEditText.text.toString()

            if (email.isEmpty() || password.isEmpty()) {
                // Display an error for empty fields
                Toast.makeText(this, "Email and password are required", Toast.LENGTH_SHORT).show()
            } else if (!isValidEmail(email)) {
                // Display an error for invalid email
                Toast.makeText(this, "email validation field", Toast.LENGTH_SHORT).show()
            } else {
                // Valid login, navigate to the profile screen
                startActivity(Intent(this, ProfileActivity::class.java))
                finish()
            }
        }
    }

    private fun isValidEmail(email: String): Boolean {
        // Implement your email validation logic here
        // For simplicity, you can use a basic pattern matching
        val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
        return email.matches(emailPattern.toRegex())
    }

}
