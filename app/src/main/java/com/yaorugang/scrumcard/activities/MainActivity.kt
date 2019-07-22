package com.yaorugang.scrumcard.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import com.yaorugang.scrumcard.R
import com.yaorugang.scrumcard.adapters.CardGridAdapter
import com.yaorugang.scrumcard.utilities.DisplayHelper

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DisplayHelper.showTransparentStatusBar(window)
        setContentView(R.layout.activity_main)

        val numberList = arrayOf("1", "3", "5", "8", "13")
        val cardGridAdapter = CardGridAdapter(numberList)

        val cardGridView = findViewById<RecyclerView>(R.id.card_grid)
        cardGridView.adapter = cardGridAdapter
        cardGridView.layoutManager = GridLayoutManager(this, 3)
    }
}
