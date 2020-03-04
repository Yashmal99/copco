package com.example.copco

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.copco_main.*

class copcomain : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.copco_main)

        setSupportActionBar(toolbar)
        val actionbar =supportActionBar
        actionbar?.title = "copco"

        val Toggle: ActionBarDrawerToggle = object : ActionBarDrawerToggle(
            this,
            drawerlayout,
            toolbar,
            (R.string.open),
            (R.string.close)
        ){}
        Toggle.isDrawerIndicatorEnabled = true
        drawerlayout.addDrawerListener(Toggle)
        Toggle.syncState()

        navigation_View.setNavigationItemSelectedListener(this)

        val fragment : Fragment = homefragments()
        if(fragment!= null)
        {
          val fragmentmanager : FragmentManager = supportFragmentManager
            val ft : FragmentTransaction = fragmentmanager.beginTransaction()
            ft.replace(R.id.screen_area,fragment)
            ft.commit()
        }
    }


    override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {

        when (menuItem.itemId) {
            R.id.home -> {
                val fragments : Fragment = homefragments()
                if(fragments!= null)
                {
                    val fragmentmanager : FragmentManager = supportFragmentManager
                    val ft : FragmentTransaction = fragmentmanager.beginTransaction()
                    ft.replace(R.id.screen_area,fragments)
                    ft.commit()
                }
            }
            R.id.plating -> {
                Toast.makeText(this, "platting", Toast.LENGTH_SHORT).show()
            }
            R.id.production -> {
                Toast.makeText(this, "production", Toast.LENGTH_SHORT).show()
            }
            R.id.rawmaterial -> {
                Toast.makeText(this, "raw material", Toast.LENGTH_SHORT).show()
            }
            R.id.settings -> {
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show()
            }
            R.id.logout -> {
                Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show()
            }


        }
        drawerlayout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onBackPressed() {
        if (drawerlayout.isDrawerOpen(GravityCompat.START)) {
            drawerlayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

}
