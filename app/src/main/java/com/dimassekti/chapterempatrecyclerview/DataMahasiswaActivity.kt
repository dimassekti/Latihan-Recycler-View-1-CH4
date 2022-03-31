package com.dimassekti.chapterempatrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_data_mahasiswa.*

class DataMahasiswaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_mahasiswa)

        val datamahasiswa = arrayListOf(
            DataMhs(com.google.android.material.R.drawable.ic_clock_black_24dp,"Ani", "23"),
            DataMhs(com.google.android.material.R.drawable.abc_btn_radio_to_on_mtrl_015,"Budi", "21"),
            DataMhs(com.google.android.material.R.drawable.ic_clock_black_24dp,"Soni", "26"),
            DataMhs(com.google.android.material.R.drawable.abc_btn_radio_to_on_mtrl_015,"Doni", "22"),
            DataMhs(com.google.android.material.R.drawable.ic_clock_black_24dp,"Roni", "25")
        )

        val adapt = AdapterMahasiswa(datamahasiswa)
        val laymanager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        rv_mahasiswa.layoutManager = laymanager
        rv_mahasiswa.adapter = adapt


    }
}