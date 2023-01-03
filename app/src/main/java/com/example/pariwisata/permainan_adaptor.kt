package com.example.pariwisata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class permainan_adaptor(val listData: ArrayList<permainan>)  :
    RecyclerView.Adapter<permainan_adaptor.ListViewHolder>(){
    inner class ListViewHolder(itemView: View):
        RecyclerView.ViewHolder(itemView){
        var judul: TextView= itemView.findViewById(R.id.judul)
        var penjelasan: TextView = itemView.findViewById(R.id.penjelasan)
        var gambar: ImageView = itemView.findViewById(R.id.gambar)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.daftar_wahana, parent,
                false)
        return ListViewHolder(view)
    }
    override fun getItemCount(): Int {
        return listData.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val Wahana = listData [position]
        Glide.with(holder.itemView.context)
            .load(Wahana.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.gambar)
        holder.judul.text = Wahana.name
        holder.penjelasan.text = Wahana.detail
    }
}

