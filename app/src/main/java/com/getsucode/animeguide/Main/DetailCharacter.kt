package com.getsucode.animeguide.Main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import com.getsucode.animeguide.R

class DetailCharacter : AppCompatActivity() {

    private var title = "ITEM DETAIL"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_character)

        setActionBarTitle(title)

        val img_anime = findViewById<ImageView>(R.id.img_anime)
        val tv_anime_name = findViewById<TextView>(R.id.tv_anime_name)
        val tv_anime_detail = findViewById<TextView>(R.id.tv_anime_detail)

        val name = intent.getStringExtra("intent_name")
        val detail = intent.getStringExtra("intent_detail")
        val image = intent.getIntExtra("intent_img", 0)

        img_anime.setImageResource(image)
        tv_anime_name.text = name
        tv_anime_detail.text = detail

    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }
}