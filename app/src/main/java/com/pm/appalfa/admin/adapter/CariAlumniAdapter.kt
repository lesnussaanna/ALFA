package com.pm.appalfa.admin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.pm.appalfa.R
import com.pm.appalfa.admin.model.CariAlumni

class CariAlumniAdapter(private val alumniList: ArrayList<CariAlumni>) :
    RecyclerView.Adapter<CariAlumniAdapter.AlumniViewHolder>() {
    class AlumniViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView : ShapeableImageView = itemView.findViewById(R.id.gambar)
        val textView : TextView = itemView.findViewById(R.id.title)
        val textView2 : TextView = itemView.findViewById(R.id.desc)
        val textView3 : TextView = itemView.findViewById(R.id.lihatProfile)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumniViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_alumni, parent, false)
        return AlumniViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlumniViewHolder, position: Int) {
        val event = alumniList[position]
        holder.imageView.setImageResource(event.image)
        holder.textView.text = event.title
        holder.textView2.text = event.desc
        holder.textView3.text = event.profile
    }

    override fun getItemCount(): Int {
        return alumniList.size
    }


}