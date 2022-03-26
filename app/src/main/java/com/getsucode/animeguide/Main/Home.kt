package com.getsucode.animeguide.Main

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.getsucode.animeguide.Adapter.ListCharacterAdapter
import com.getsucode.animeguide.Model.Character
import com.getsucode.animeguide.R
import com.getsucode.animeguide.Repository.CharacterData
import com.google.android.material.bottomnavigation.BottomNavigationView

class Home : AppCompatActivity() {

    private lateinit var rvCharacter: RecyclerView
    private var title = "ANIME GUIDE"
    private val list = ArrayList<Character>()

    // Test konek github

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setActionBarTitle(title)

        // webview

        rvCharacter = findViewById(R.id.rv_anime)
        rvCharacter.setHasFixedSize(true)

        list.addAll(CharacterData.listData)
        showRecyclerList()

        // button navigasi

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        bottomNavigationView.selectedItemId = R.id.ic_home

        bottomNavigationView.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.ic_home -> return@OnNavigationItemSelectedListener true
                R.id.ic_about -> {
                    startActivity(Intent(applicationContext, About::class.java))
                    overridePendingTransition(0, 0)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.ic_info -> {
                    startActivity(Intent(applicationContext, Info::class.java))
                    overridePendingTransition(0, 0)
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        })
    }

    // toolbar menu

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        Intent.FLAG_ACTIVITY_CLEAR_TASK
        Intent.FLAG_ACTIVITY_NEW_TASK
        when (item.itemId) {
            R.id.miDeveloper -> {
                var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/h_0FtYwrlE0"))
                startActivity(intent)
            }
            R.id.miFeedback -> {
                var intent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://getsudesig95@gmail.com")
                )
                startActivity(intent)
            }
            R.id.miShare -> {
                val intent = Intent()
                intent.action = Intent.ACTION_SEND
                intent.putExtra(
                    Intent.EXTRA_TEXT,
                    "Aplikasi kami sudah rilis, Gaskeun Mamang : https://github.com/GetsuGit"
                )
                intent.type = "text/plain"
                startActivity(Intent.createChooser(intent, "Share To:"))
            }
            R.id.miClose -> {

                    Intent.FLAG_ACTIVITY_CLEAR_TASK
                    Intent.FLAG_ACTIVITY_NEW_TASK
                    onBackPressed()
            }
        }
        return true
    }

    private fun showRecyclerList() {
        rvCharacter.layoutManager = LinearLayoutManager(this)
        val listCharacter = ListCharacterAdapter(list)
        rvCharacter.adapter = listCharacter

        listCharacter.setOnItemClickCallback(object : ListCharacterAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Character) {
                showSelectedCharacter(data)
            }
        })
    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }

    private fun showSelectedCharacter(character: Character) {

        val detailCharacter = Intent(this, DetailCharacter::class.java)

        detailCharacter.putExtra("intent_img", character.image)
        detailCharacter.putExtra("intent_name", character.name)
        detailCharacter.putExtra("intent_detail", character.detail)

        startActivity(detailCharacter)

        //Toast.makeText(this, "Kamu memilih" + character.name, Toast.LENGTH_LONG).show()

    }

    // buttom menu

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameFragment, fragment)
            commit()
        }

    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this, R.style.CustomDialogTheme)
        builder.setIcon(R.drawable.anime)

        builder.setTitle("Keluar")
        builder.setMessage("Anda mau keluar dari aplikasi ?")
        builder.setPositiveButton("Ya") { dialogInterface, i -> finish() }

        builder.setNegativeButton("Tidak", null)
        val alertDialog = builder.create()
        alertDialog.show()

    }
}