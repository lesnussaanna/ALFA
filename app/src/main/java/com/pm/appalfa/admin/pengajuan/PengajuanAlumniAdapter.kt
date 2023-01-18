package com.pm.appalfa.admin.pengajuan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.pm.appalfa.R

class PengajuanAlumniAdapter(private val pengajuanAlumniList: ArrayList<PengajuanAlumni>) :
    RecyclerView.Adapter<PengajuanAlumniAdapter.PengajuanAlumniViewHolder>() {

    class PengajuanAlumniViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView : ShapeableImageView = itemView.findViewById(R.id.gambar)
        val textView : TextView = itemView.findViewById(R.id.title)
        val textView2 : TextView = itemView.findViewById(R.id.desc)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PengajuanAlumniViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_pengajuan_alumni, parent, false)
        return PengajuanAlumniViewHolder(view)
    }

    override fun onBindViewHolder(holder: PengajuanAlumniViewHolder, position: Int) {
        val event = pengajuanAlumniList[position]
        holder.imageView.setImageResource(event.image)
        holder.textView.text = event.title
        holder.textView2.text = event.desc
    }

    override fun getItemCount(): Int {
        return pengajuanAlumniList.size
    }
}