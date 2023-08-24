package com.aryanparmar.mad_practical4_21012011061

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var l: Button = findViewById(R.id.login);
        var s: Button = findViewById(R.id.Signup);
        s.setOnClickListener() {
            var i = Intent(this, reg::class.java)
            startActivity(i);

        }
        l.setOnClickListener() {

            var i = Intent(this, activity_login_ori::class.java)
            startActivity(i);

        }
    }
}