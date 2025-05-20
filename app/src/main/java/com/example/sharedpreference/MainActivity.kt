package com.example.sharedpreference

import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var login: EditText
    private lateinit var pass: EditText
    private lateinit var sharedpreference: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login = findViewById(R.id.login)
        pass = findViewById(R.id.pass)

        sharedpreference = getPreferences(MODE_PRIVATE)
    }

    fun handler(v: View) {
        when (v.id) {
            R.id.save -> {
                val ed = sharedpreference.edit()
                ed.putString("login", login.text.toString())
                ed.putString("password", pass.text.toString())
                ed.apply()
            }
            R.id.load -> {
                login.setText(sharedpreference.getString("login", ""))
                pass.setText(sharedpreference.getString("password", ""))
            }
        }
    }
}