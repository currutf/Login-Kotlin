package com.app.pipe

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editTextUsername: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonValidate: Button
    private lateinit var buttonLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextUsername = findViewById(R.id.etUsername)
        editTextPassword = findViewById(R.id.etPassword)
        buttonValidate = findViewById(R.id.btnValidate)
        buttonLogin = findViewById(R.id.btnLogin)

        buttonValidate.setOnClickListener {
            val username = editTextUsername.text.toString()
            val password = editTextPassword.text.toString()

            if (validateCredentials(username, password)) {
                buttonLogin.visibility = View.VISIBLE
            }
        }

        buttonLogin.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }

    private fun validateCredentials(username: String, password: String): Boolean {
        val validUsernames = listOf("Usuario1", "Usuario2", "Usuario3")
        val validPasswords = listOf("Clave1", "Clave2", "Clave3")

        return validUsernames.contains(username) && validPasswords.contains(password)
    }
}