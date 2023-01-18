package com.pm.appalfa.admin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pm.appalfa.R
import com.pm.appalfa.admin.adapter.EventAdapter
import com.pm.appalfa.admin.model.Event
import com.pm.appalfa.databinding.ActivityEventBinding

class EventActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEventBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var eventList: ArrayList<Event>
    private lateinit var eventAdapter: EventAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEventBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()

    }

    private fun init() {
        recyclerView = findViewById(R.id.rvCategory)
        recyclerView.setHasFixedSize(true)
        // val mLayoutManager: RecyclerView.LayoutManager = GridLayoutManager(activity, 3)
        recyclerView.layoutManager = GridLayoutManager(this, 2)


        eventList = ArrayList()
        addDataToList()

        eventAdapter = EventAdapter(eventList)
        recyclerView.adapter = eventAdapter
    }


    private fun addDataToList() {
        eventList.add(
            Event(
                R.drawable.gambarevent1,
                "Guest Lecture “Machine Learning”",
                "Let’s find out what trends in machine learning, learn, get the inspiration, and make an innovation!"
            )
        )
        eventList.add(
            Event(
                R.drawable.gambarevent2,
                "Webinar “Research Trend in Big Data”",
                "Let’s find out what trends in big data, learn, get the inspiration, and make an innovation!"
            )
        )
        eventList.add(
            Event(
                R.drawable.gambarevent3,
                "Webinar “Training of Trainer Related to Computer Graphics and Vision”",
                "Let’s find out what trends in computer graphics, learn, get the inspiration, and make an innovation!"
            )
        )
        eventList.add(
            Event(
                R.drawable.gambarevent4,
                "Workshop of Writing Dissertation Proposal",
                "Let’s find out what trends in writing dissertation proposal, learn, get the inspiration, and make an innovation!"
            )
        )
        eventList.add(
            Event(
                R.drawable.gambarevent5,
                "Workshop “Preparation of PKM Students”",
                "Let’s find out what trends in Preparation, learn, get the inspiration, and make an innovation!"
            )
        )
        eventList.add(
            Event(
                R.drawable.gambarevent6,
                "Talkshow “Building Digital Ecosystem”",
                "Let’s find out what trends in building digital ecosystem, learn, get the inspiration, and make an innovation!"
            )
        )
        eventList.add(
            Event(
                R.drawable.gambarevent1,
                "Guest Lecture “Machine Learning”",
                "Let’s find out what trends in machine learning, learn, get the inspiration, and make an innovation!"
            )
        )
        eventList.add(
            Event(
                R.drawable.gambarevent2,
                "Webinar “Research Trend in Big Data”",
                "Let’s find out what trends in big data, learn, get the inspiration, and make an innovation!"
            )
        )
        eventList.add(
            Event(
                R.drawable.gambarevent3,
                "Webinar “Training of Trainer Related to Computer Graphics and Vision”",
                "Let’s find out what trends in computer graphics, learn, get the inspiration, and make an innovation!"
            )
        )
        eventList.add(
            Event(
                R.drawable.gambarevent4,
                "Workshop of Writing Dissertation Proposal",
                "Let’s find out what trends in writing dissertation proposal, learn, get the inspiration, and make an innovation!"
            )
        )
        eventList.add(
            Event(
                R.drawable.gambarevent5,
                "Workshop “Preparation of PKM Students”",
                "Let’s find out what trends in Preparation, learn, get the inspiration, and make an innovation!"
            )
        )
        eventList.add(
            Event(
                R.drawable.gambarevent6,
                "Talkshow “Building Digital Ecosystem”",
                "Let’s find out what trends in building digital ecosystem, learn, get the inspiration, and make an innovation!"
            )
        )

    }
}