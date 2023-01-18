package com.pm.appalfa.alumni.event

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pm.appalfa.R

class EventAlumni : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var eventList: ArrayList<Event>
    private lateinit var eventAdapter: EventAdapter

    lateinit var imageId : Array<Int>
    lateinit var nama_event : Array<String>
    lateinit var desc_event : Array<String>

    private fun dataInitialize(){

        eventList = arrayListOf<Event>()

        imageId = arrayOf(
            R.drawable.gambarevent1,
            R.drawable.gambarevent2,
            R.drawable.gambarevent3,
            R.drawable.gambarevent4,
            R.drawable.gambarevent5,
            R.drawable.gambarevent6
        )

        nama_event = arrayOf(
            getString(R.string.nama_event1),
            getString(R.string.nama_event2),
            getString(R.string.nama_event3),
            getString(R.string.nama_event4),
            getString(R.string.nama_event5),
            getString(R.string.nama_event6)
        )
        desc_event = arrayOf(
            getString(R.string.desc1),
            getString(R.string.desc2),
            getString(R.string.desc3),
            getString(R.string.desc4),
            getString(R.string.desc5),
            getString(R.string.desc6)
        )
        for(i in imageId.indices){

            val event = Event(imageId[i],nama_event[i], desc_event[i])
            eventList.add(event)

        }
    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityEventBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        init()
//
//    }
//
//    private fun init() {
//        recyclerView = findViewById(R.id.rvCategory)
//        recyclerView.setHasFixedSize(true)
//        // val mLayoutManager: RecyclerView.LayoutManager = GridLayoutManager(activity, 3)
//        recyclerView.layoutManager = GridLayoutManager(this, 2)
//
//
//        eventList = ArrayList()
//        addDataToList()
//
//        eventAdapter = EventAdapter(eventList)
//        recyclerView.adapter = eventAdapter
//    }
//
//
//    private fun addDataToList() {
//        eventList.add(
//            Event(
//                R.drawable.gambarevent1,
//                "Guest Lecture “Machine Learning”",
//                "Let’s find out what trends in machine learning, learn, get the inspiration, and make an innovation!"
//            )
//        )
//        eventList.add(
//            Event(
//                R.drawable.gambarevent2,
//                "Webinar “Research Trend in Big Data”",
//                "Let’s find out what trends in big data, learn, get the inspiration, and make an innovation!"
//            )
//        )
//        eventList.add(
//            Event(
//                R.drawable.gambarevent3,
//                "Webinar “Training of Trainer Related to Computer Graphics and Vision”",
//                "Let’s find out what trends in computer graphics, learn, get the inspiration, and make an innovation!"
//            )
//        )
//        eventList.add(
//            Event(
//                R.drawable.gambarevent4,
//                "Workshop of Writing Dissertation Proposal",
//                "Let’s find out what trends in writing dissertation proposal, learn, get the inspiration, and make an innovation!"
//            )
//        )
//        eventList.add(
//            Event(
//                R.drawable.gambarevent5,
//                "Workshop “Preparation of PKM Students”",
//                "Let’s find out what trends in Preparation, learn, get the inspiration, and make an innovation!"
//            )
//        )
//        eventList.add(
//            Event(
//                R.drawable.gambarevent6,
//                "Talkshow “Building Digital Ecosystem”",
//                "Let’s find out what trends in building digital ecosystem, learn, get the inspiration, and make an innovation!"
//            )
//        )
//        eventList.add(
//            Event(
//                R.drawable.gambarevent1,
//                "Guest Lecture “Machine Learning”",
//                "Let’s find out what trends in machine learning, learn, get the inspiration, and make an innovation!"
//            )
//        )
//        eventList.add(
//            Event(
//                R.drawable.gambarevent2,
//                "Webinar “Research Trend in Big Data”",
//                "Let’s find out what trends in big data, learn, get the inspiration, and make an innovation!"
//            )
//        )
//        eventList.add(
//            Event(
//                R.drawable.gambarevent3,
//                "Webinar “Training of Trainer Related to Computer Graphics and Vision”",
//                "Let’s find out what trends in computer graphics, learn, get the inspiration, and make an innovation!"
//            )
//        )
//        eventList.add(
//            Event(
//                R.drawable.gambarevent4,
//                "Workshop of Writing Dissertation Proposal",
//                "Let’s find out what trends in writing dissertation proposal, learn, get the inspiration, and make an innovation!"
//            )
//        )
//        eventList.add(
//            Event(
//                R.drawable.gambarevent5,
//                "Workshop “Preparation of PKM Students”",
//                "Let’s find out what trends in Preparation, learn, get the inspiration, and make an innovation!"
//            )
//        )
//        eventList.add(
//            Event(
//                R.drawable.gambarevent6,
//                "Talkshow “Building Digital Ecosystem”",
//                "Let’s find out what trends in building digital ecosystem, learn, get the inspiration, and make an innovation!"
//            )
//        )
//
//    }
}