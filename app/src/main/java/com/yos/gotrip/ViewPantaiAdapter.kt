package com.yos.gotrip

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ViewPantaiAdapter(private val listPantai: ArrayList<Pantai>, private val onClickListener: (Pantai) -> Unit) :
    RecyclerView.Adapter<ViewPantaiAdapter.ViewPantaiViewHolder>() {
    class ViewPantaiViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var pantaiName: TextView = itemView.findViewById(R.id.nama_pantai)
        var pantaiLoc: TextView = itemView.findViewById(R.id.location)
        var pantaiImg: ImageView = itemView.findViewById(R.id.ivImage)
        var cardPantai: CardView = itemView.findViewById(R.id.card_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPantaiViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_card_travel, parent, false)
        return ViewPantaiViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewPantaiViewHolder, position: Int) {
        val pantai = listPantai[position]

        Glide.with(holder.itemView.context)
            .load(pantai.img)
            .apply(RequestOptions().override(157, 157))
            .into(holder.pantaiImg)

        holder.pantaiName.text = pantai.name
        holder.pantaiLoc.text = pantai.loc
        holder.cardPantai.setOnClickListener { onClickListener(pantai) }
    }

    override fun getItemCount(): Int {
        return listPantai.size
    }

}