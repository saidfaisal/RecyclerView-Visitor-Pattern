package com.example.recyclerviewvisitorpattern.viewholder

import android.view.View
import com.example.recyclerviewvisitorpattern.BaseViewHolder
import com.example.recyclerviewvisitorpattern.model.Fruit
import kotlinx.android.synthetic.main.rv_item_card.view.*

class CardViewHolder(view: View): BaseViewHolder<Fruit>(view) {

    override fun bind(model: Fruit) {
        itemView.tv_name.text = model.name
        itemView.tv_color.text = model.color
    }

}