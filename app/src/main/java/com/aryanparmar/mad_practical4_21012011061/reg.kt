package com.aryanparmar.mad_practical4_21012011061

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class reg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)
        var lgn: Button = findViewById(R.id.lgn); lgn.setOnClickListener() {

            var intent = Intent(this, activity_login_ori::class.java);
            startActivity(intent);
        }

    }

}
