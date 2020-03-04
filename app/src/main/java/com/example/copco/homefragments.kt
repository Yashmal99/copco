package com.example.copco

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*

class homefragments : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?) : View?{
        return inflater.inflate(R.layout.fragment_home, container ,false)!!
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.production_card.setOnClickListener {

            val intent = Intent(activity ,productioncard::class.java)
            startActivity(intent)
        }

        view.platting_card.setOnClickListener {

            val intent = Intent(activity ,plattingcard::class.java)
            startActivity(intent)
        }

        view.raw_card.setOnClickListener {

            val intent = Intent(activity ,rawcard::class.java)
            startActivity(intent)
        }

        view.about_card.setOnClickListener {

            val intent = Intent(activity ,aboutuscard::class.java)
            startActivity(intent)
        }
    }




}