package com.example.pract15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class SignInActivity : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sigin)
        email = findViewById(R.id.editText)
        password = findViewById(R.id.editText2)
    }
    fun signin(view: View) {
        if (email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()){
            val intent = Intent(this@SignInActivity, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }
        else{
            val alert = AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("У вас есть незаполненные поля")
                .setPositiveButton("Ok", null)
                .create()
                .show()
        }
    }
}