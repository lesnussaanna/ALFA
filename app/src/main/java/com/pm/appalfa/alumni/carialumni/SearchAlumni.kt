package com.pm.appalfa.alumni.carialumni

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pm.appalfa.R

class SearchAlumni : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search_alumni, container, false)
    }

//    private lateinit var binding : SearchAlumniBinding
//    private lateinit var recyclerView: RecyclerView
//    private lateinit var alumniList : ArrayList<Alumni>
//    private lateinit var alumniAdapter : AlumniAdapter
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = SearchAlumniBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        init()
//    }
//
//    private fun init() {
//        binding.listAlumni.layoutManager = LinearLayoutManager(this)
//        recyclerView = findViewById(R.id.listAlumni)
//        // recyclerView.layoutManager = LinearLayoutManager(this)
//
//        alumniList = ArrayList()
//        addDataToList()
//
//        alumniAdapter = AlumniAdapter(alumniList)
//        recyclerView.adapter = alumniAdapter
//    }
//
//    private fun addDataToList() {
//        alumniList.add(Alumni(R.drawable.nanda, "Nanda Amelia", "S1 Teknologi Informasi, 2019", "Lihat Profile"))
//        alumniList.add(Alumni(R.drawable.yuni, "Sri Wahyuni", "S1 Teknologi Informasi, 2019", "Lihat Profile"))
//        alumniList.add(Alumni(R.drawable.katherin, "Katherine Anna", "S1 Teknologi Informasi, 2019", "Lihat Profile"))
//        alumniList.add(Alumni(R.drawable.nanda, "Nanda Amelia", "S1 Teknologi Informasi, 2019", "Lihat Profile"))
//        alumniList.add(Alumni(R.drawable.yuni, "Sri Wahyuni", "S1 Teknologi Informasi, 2019", "Lihat Profile"))
//        alumniList.add(Alumni(R.drawable.katherin, "Katherine Anna", "S1 Teknologi Informasi, 2019", "Lihat Profile"))
//
//    }
}