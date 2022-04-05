package com.getsucode.animeguide.Adapter

import android.view.LayoutInflater
import android.view.ScrollCaptureCallback
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.getsucode.animeguide.Model.Character
import com.getsucode.animeguide.R
import org.w3c.dom.Text

class ListCharacterAdapter(private val listCharacter: ArrayList<Character>) :
    RecyclerView.Adapter<ListCharacterAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_row_anime, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val characterAnime = listCharacter[position]

        Glide.with(holder.itemView.context)
            .load(characterAnime.image)
            .apply(RequestOptions().override(100, 100))
            .into(holder.imgAnime)

        holder.tvName.text = characterAnime.name
        holder.tvDetail.text = characterAnime.detail

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listCharacter[holder.absoluteAdapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listCharacter.size
    }

    inner class ListViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var imgAnime: ImageView = itemView.findViewById(R.id.img_anime)
        var tvName: TextView = itemView.findViewById(R.id.tv_anime_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_anime_detail)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Character)
    }
}