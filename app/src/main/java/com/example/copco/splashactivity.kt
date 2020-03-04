package com.example.copco

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class splashactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)

        val handler = Handler()
        handler.postDelayed(Runnable {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        },500)
    }
}
