package com.example.pract15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun Login(view: View) {
        val intent = Intent(this@MainActivity, SignInActivity::class.java)
        startActivity(intent)
        finish()
    }
}