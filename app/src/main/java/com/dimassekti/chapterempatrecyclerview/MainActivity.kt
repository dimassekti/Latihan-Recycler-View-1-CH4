package com.dimassekti.chapterempatrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pertama.setOnClickListener {
            val pindah = Intent(this, AdapterMahasiswa::class.java)
            startActivity(pindah)
        }

        kedua.setOnClickListener {
            val pindah = Intent(this, DataMhs::class.java)
            startActivity(pindah)
        }

        ketiga.setOnClickListener {
            val pindah = Intent(this, DataMahasiswaActivity::class.java)
            startActivity(pindah)
        }

    }


}