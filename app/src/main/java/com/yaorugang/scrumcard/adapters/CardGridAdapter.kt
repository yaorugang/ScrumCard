package com.yaorugang.scrumcard.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yaorugang.scrumcard.R
import com.yaorugang.scrumcard.views.Card
import kotlinx.android.synthetic.main.card_grid_cell.view.*

class CardGridAdapter(private val numberList: Array<String>) : RecyclerView.Adapter<CardGridAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val cardGridCell = LayoutInflater.from(parent.context).inflate(R.layout.card_grid_cell, parent,false)

        return CardGridAdapter.ViewHolder(cardGridCell)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.card?.setNumber(numberList[position])
    }

    override fun getItemCount(): Int {
        return numberList.size
    }

    class ViewHolder(cardGridCell: View) : RecyclerView.ViewHolder(cardGridCell) {
        val card: Card? = cardGridCell.card
    }
}
