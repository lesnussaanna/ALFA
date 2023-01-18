package com.pm.appalfa.admin.pengajuan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pm.appalfa.R
import com.pm.appalfa.admin.HomeAdmin
import com.pm.appalfa.databinding.ActivityPengajuanAlumniBinding

class PengajuanAlumniActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPengajuanAlumniBinding

    private lateinit var recyclerView: RecyclerView
    private lateinit var pengajuanAlumniList : ArrayList<PengajuanAlumni>
    private lateinit var pengajuanAlumniAdapter : PengajuanAlumniAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPengajuanAlumniBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
        init2()
        init3()
    }

    private fun init() {
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView = findViewById(R.id.recyclerView)
        // recyclerView.layoutManager = LinearLayoutManager(this)

        pengajuanAlumniList = ArrayList()
        addDataToList()

        pengajuanAlumniAdapter = PengajuanAlumniAdapter(pengajuanAlumniList)
        recyclerView.adapter = pengajuanAlumniAdapter
    }

    private fun init2() {
        binding.recyclerView2.layoutManager = LinearLayoutManager(this)
        recyclerView = findViewById(R.id.recyclerView2)
        // recyclerView.layoutManager = LinearLayoutManager(this)

        pengajuanAlumniList = ArrayList()
        addDataToList()

        pengajuanAlumniAdapter = PengajuanAlumniAdapter(pengajuanAlumniList)
        recyclerView.adapter = pengajuanAlumniAdapter
    }

    private fun init3() {
        binding.recyclerView3.layoutManager = LinearLayoutManager(this)
        recyclerView = findViewById(R.id.recyclerView3)
        // recyclerView.layoutManager = LinearLayoutManager(this)

        pengajuanAlumniList = ArrayList()
        addDataToList()

        pengajuanAlumniAdapter = PengajuanAlumniAdapter(pengajuanAlumniList)
        recyclerView.adapter = pengajuanAlumniAdapter
    }



    private fun addDataToList() {
        pengajuanAlumniList.add(PengajuanAlumni(R.drawable.nanda, "Nanda Amelia", "You have registered"))
        pengajuanAlumniList.add(PengajuanAlumni(R.drawable.sriwahyuni, "Sri Wahyuni", "You have registered"))
        pengajuanAlumniList.add(PengajuanAlumni(R.drawable.katherin, "katherine Anna", "You have registered"))
        pengajuanAlumniList.add(PengajuanAlumni(R.drawable.nanda, "Nanda Amelia", "You have registered"))
        pengajuanAlumniList.add(PengajuanAlumni(R.drawable.sriwahyuni, "Sri Wahyuni", "You have registered"))
        pengajuanAlumniList.add(PengajuanAlumni(R.drawable.katherin, "katherine Anna", "You have registered"))

    }

    fun btnBack(view: View) {
        val intent = Intent(this@PengajuanAlumniActivity, HomeAdmin::class.java)
        startActivity(intent)
    }
}