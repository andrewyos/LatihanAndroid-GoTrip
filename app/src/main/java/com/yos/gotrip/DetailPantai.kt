package com.yos.gotrip

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailPantai:AppCompatActivity() {
    private lateinit var textPantai: TextView
    private lateinit var imgPantai: ImageView
    private lateinit var locPantai: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_pantai)
        textPantai = findViewById(R.id.detail_nama_pantai)
        imgPantai = findViewById(R.id.pantai_gambar)
        locPantai = findViewById(R.id.detail_lokasi_pantai)

        val namaPantai = intent.getStringExtra("pantai")
        textPantai.text = namaPantai

        val gambarPantai = intent.getIntExtra("imgpantai", 0)
        imgPantai.setImageResource(gambarPantai)

        val lokasiPantai = intent.getStringExtra("locpantai")
        locPantai.text = lokasiPantai
    }

}