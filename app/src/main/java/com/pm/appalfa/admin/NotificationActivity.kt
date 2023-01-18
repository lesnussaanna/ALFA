package com.pm.appalfa.admin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pm.appalfa.R
import com.pm.appalfa.admin.adapter.NotificationAdapter
import com.pm.appalfa.admin.model.Notification
import com.pm.appalfa.databinding.ActivityNotificationBinding

class NotificationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNotificationBinding

    private lateinit var recyclerView: RecyclerView
    private lateinit var notificationList : ArrayList<Notification>
    private lateinit var notificationAdapter : NotificationAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotificationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
        init2()
    }

    private fun init() {
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView = findViewById(R.id.recyclerView)
        // recyclerView.layoutManager = LinearLayoutManager(this)

        notificationList = ArrayList()
        addDataToList()

        notificationAdapter = NotificationAdapter(notificationList)
        recyclerView.adapter = notificationAdapter
    }

    private fun init2() {
        binding.recyclerView2.layoutManager = LinearLayoutManager(this)
        recyclerView = findViewById(R.id.recyclerView2)
        // recyclerView.layoutManager = LinearLayoutManager(this)

        notificationList = ArrayList()
        addDataToList()

        notificationAdapter = NotificationAdapter(notificationList)
        recyclerView.adapter = notificationAdapter
    }

    private fun addDataToList() {
        notificationList.add(Notification(R.drawable.img_like, "Nanda Amelia", "Menyukai Postingan"))
        notificationList.add(Notification(R.drawable.img_komen, "Nanda Amelia", "Menyukai Postingan"))
        notificationList.add(Notification(R.drawable.img_like, "Sri Wahyuni", "Menyukai Postingan"))
        notificationList.add(Notification(R.drawable.img_komen, "Kathrine Anna", "Menyukai Postingan"))

    }

}