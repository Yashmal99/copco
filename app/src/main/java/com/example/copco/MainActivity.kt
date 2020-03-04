package com.example.copco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var user: String = "copco"
    var pass: String = "copco"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        login.setOnClickListener {
            if (user.equals(username.text.toString()) && pass.equals(password.text.toString())) {

                var intent = Intent(this, copcomain::class.java)
                startActivity(intent)
                Toast.makeText(this,"Logged in successfully",Toast.LENGTH_SHORT).show()

            }
            else {

                Toast.makeText(this,"Please Try Again",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
