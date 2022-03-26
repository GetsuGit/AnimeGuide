package com.getsucode.animeguide.Main

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AlertDialog
import com.getsucode.animeguide.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class About : AppCompatActivity() {

    private var title = "ABOUT"
    private lateinit var Instagram: ImageView
    private lateinit var Github: ImageView
    private lateinit var Facebook: ImageView
    private lateinit var Youtube: ImageView
    private lateinit var WhatsApp: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        setActionBarTitle(title)

        // ini sial sosmed
        Instagram = findViewById(R.id.Instagram)
        Github = findViewById(R.id.Github)
        Facebook = findViewById(R.id.Facebook)
        Youtube = findViewById(R.id.Youtube)
        WhatsApp = findViewById(R.id.WhatsApp)

        Sosmed()

        // button navigasi

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        bottomNavigationView.selectedItemId = R.id.ic_about

        bottomNavigationView.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.ic_home -> {
                    Intent(this, Home::class.java).also {
                        it.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                        it.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                        startActivity(it)
                    }
                    overridePendingTransition(0, 0)
                    return@OnNavigationItemSelectedListener true
                }

            }
            false
        })

    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }

    override fun onBackPressed() {
        Intent(this, Home::class.java).also {
            it.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            it.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(it)
        }
    }

    private fun Sosmed() {

        Instagram.setOnClickListener {
            var intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.instagram.com/getsudesign/")
            )
            startActivity(intent)
        }
        Github.setOnClickListener {
            var intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://github.com/GetsuGit")
            )
            startActivity(intent)
        }
        Facebook.setOnClickListener {
            var intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://web.facebook.com/profile.php?id=100009780185669")
            )
            startActivity(intent)
        }
        Youtube.setOnClickListener {
            var intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/channel/UCL6_jRIJOu5J3U7LxkcCD6A/videos")
            )
            startActivity(intent)
        }
        WhatsApp.setOnClickListener {
            var intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://api.whatsapp.com/send?phone=6285216324924")
            )
            startActivity(intent)
        }
    }
}