package com.yaorugang.scrumcard.views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout
import com.yaorugang.scrumcard.R
import kotlinx.android.synthetic.main.card.view.*

class Card(context: Context, attrs: AttributeSet) : RelativeLayout(context, attrs) {

    init {
        LayoutInflater.from(context).inflate(R.layout.card, this, true)
    }

    fun setNumber(number: String) {
        number_tv?.text = number
    }
}