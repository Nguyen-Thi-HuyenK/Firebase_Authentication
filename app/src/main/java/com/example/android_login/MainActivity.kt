package com.example.android_login

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.android_login.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class MainActivity : AppCompatActivity() {

    private lateinit var welcomeTextView: TextView
    private lateinit var emailTextView: TextView
    private lateinit var passwordTextView: TextView
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        welcomeTextView = findViewById(R.id.welcomeTextView)
        emailTextView = findViewById(R.id.emailTextView)
        passwordTextView = findViewById(R.id.passwordTextView)
        firebaseAuth = FirebaseAuth.getInstance()

        // Get current user
        val currentUser: FirebaseUser? = firebaseAuth.currentUser

        // Update TextViews with user information
        currentUser?.let {
            val email = it.email ?: "Unknown" // Check if email is null
            val maskedPassword = "*".repeat(8) // Mask the password with stars (adjust the length as needed)

            welcomeTextView.text = "Welcome to your profile"
            emailTextView.text = "Email: $email"
            passwordTextView.text = "Password: $maskedPassword"
        }
    }
}