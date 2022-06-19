package com.example.reallaundry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PemesananActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pemesanan)
        val Tvsimpan:TextView = findViewById(R.id.TvSmpn)

        Tvsimpan.setOnClickListener{
            val intentDashboard = Intent (this, DashboardActivity::class.java)
            startActivity(intentDashboard)
        }
    }
}