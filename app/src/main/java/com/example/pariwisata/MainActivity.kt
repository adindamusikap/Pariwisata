package com.example.pariwisata

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_login = findViewById<Button>(R.id.btn_login)
        btn_login.setOnClickListener{
            Intent(this, HomePage :: class.java).also {
                startActivity(it)
            }
        }
    }
    private lateinit var wahana: RecyclerView
    private var list: ArrayList<permainan> = arrayListOf()
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wahana= findViewById(R.id.wahana)
        wahana.setHasFixedSize(true)
        list.addAll(Wahana.listData)
        showRecycler()
    }
    private fun showRecycler() {
        wahana.layoutManager = LinearLayoutManager(this)
        val permaianAdapter = permainan_adaptor(list)
        wahana.adapter = permaianAdapter
    }
}