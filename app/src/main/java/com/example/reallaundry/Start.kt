package com.example.reallaundry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class Start : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start)

        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            val intent = Intent (this,PemesananActivity::class.java)
            startActivity(intent)
            onDestroy()
        },5000)

    }
}