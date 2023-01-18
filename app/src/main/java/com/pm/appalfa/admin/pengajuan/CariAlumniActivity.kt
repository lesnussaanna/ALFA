package com.pm.appalfa.admin.pengajuan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pm.appalfa.R
import com.pm.appalfa.admin.adapter.CariAlumniAdapter
import com.pm.appalfa.admin.model.CariAlumni
import com.pm.appalfa.databinding.ActivityCariAlumniBinding

class CariAlumniActivity : AppCompatActivity() {
    private lateinit var binding : ActivityCariAlumniBinding

    private lateinit var recyclerView: RecyclerView
    private lateinit var alumniList : ArrayList<CariAlumni>
    private lateinit var alumniAdapter : CariAlumniAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCariAlumniBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        binding.listAlumni.layoutManager = LinearLayoutManager(this)
        recyclerView = findViewById(R.id.listAlumni)
        // recyclerView.layoutManager = LinearLayoutManager(this)

        alumniList = ArrayList()
        addDataToList()

        alumniAdapter = CariAlumniAdapter(alumniList)
        recyclerView.adapter = alumniAdapter
    }

    private fun addDataToList() {
        alumniList.add(CariAlumni(R.drawable.nanda, "Nanda Amelia", "S1 Teknologi Informasi, 2019", "Lihat Profile"))
        alumniList.add(CariAlumni(R.drawable.sriwahyuni, "Sri Wahyuni", "S1 Teknologi Informasi, 2019", "Lihat Profile"))
        alumniList.add(CariAlumni(R.drawable.katherin, "Katherine Anna", "S1 Teknologi Informasi, 2019", "Lihat Profile"))
        alumniList.add(CariAlumni(R.drawable.sriwahyuni, "Sri Wahyuni", "S1 Teknologi Informasi, 2019", "Lihat Profile"))
        alumniList.add(CariAlumni(R.drawable.katherin, "Katherine Anna", "S1 Teknologi Informasi, 2019", "Lihat Profile"))

    }
}