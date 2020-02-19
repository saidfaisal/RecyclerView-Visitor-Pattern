package com.example.recyclerviewvisitorpattern.viewholder

import android.view.View
import com.example.recyclerviewvisitorpattern.BaseViewHolder
import com.example.recyclerviewvisitorpattern.model.Nakama
import kotlinx.android.synthetic.main.rv_item_top.view.*

class TopViewHolder(view: View): BaseViewHolder<Nakama>(view) {

    override fun bind(model: Nakama) {
        itemView.textView.text = model.name
    }
}