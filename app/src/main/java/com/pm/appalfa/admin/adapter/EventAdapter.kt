package com.pm.appalfa.admin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.pm.appalfa.R
import com.pm.appalfa.admin.model.Event

class EventAdapter (private val eventList : ArrayList<Event>) :
    RecyclerView.Adapter<EventAdapter.EventViewHolder>() {

    class EventViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView : ImageView = itemView.findViewById(R.id.gambar)
        val textView : TextView = itemView.findViewById(R.id.judul)
        val textView2 : TextView = itemView.findViewById(R.id.desc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_event, parent, false)
        return EventViewHolder(view)
    }

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        val event = eventList[position]
        holder.imageView.setImageResource(event.image)
        holder.textView.text = event.name
        holder.textView2.text = event.desc
    }

    override fun getItemCount(): Int {
        return eventList.size
    }
}