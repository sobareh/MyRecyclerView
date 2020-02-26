package com.lamorado.myrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewAdapter(private val listHeroes: ArrayList<Hero>) : RecyclerView.Adapter<CardViewAdapter.CardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_hero, parent, false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listHeroes.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val hero = listHeroes[position]

        Glide.with(holder.itemView.context)
            .load(hero.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)

        holder.tvName.text = hero.name
        holder.tvDetail.text = hero.detail
        holder.btnFavorite.setOnClickListener { Toast.makeText(holder.itemView.context, "Favorite " + listHeroes[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }
        holder.btnShare.setOnClickListener { Toast.makeText(holder.itemView.context, "Share " + listHeroes[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }
        holder.itemView.setOnClickListener { Toast.makeText(holder.itemView.context, "Kamu memilih " + listHeroes[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }


    }

    inner class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var btnFavorite: Button = itemView.findViewById(R.id.btn_set_favorite)
        var btnShare: Button = itemView.findViewById(R.id.btn_set_share)
    }

}