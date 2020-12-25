package com.yos.gotrip

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvTravel: RecyclerView
    private var list: ArrayList<Pantai> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvTravel = findViewById(R.id.popular_travel)
        rvTravel.setHasFixedSize(true)


        list.addAll(TravelData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvTravel.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val cardPantaiAdapter = ViewPantaiAdapter(list)  { pantai ->
            val intent = Intent(this, DetailPantai::class.java)
            intent.putExtra("pantai", pantai.name)
            intent.putExtra("imgpantai", pantai.img)
            intent.putExtra("locpantai", pantai.loc)

            startActivity(intent)
        }


        rvTravel.adapter = cardPantaiAdapter

    }

}