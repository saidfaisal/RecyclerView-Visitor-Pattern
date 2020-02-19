package com.example.recyclerviewvisitorpattern.viewholder

import android.view.View
import com.example.recyclerviewvisitorpattern.BaseViewHolder
import com.example.recyclerviewvisitorpattern.model.Person
import kotlinx.android.synthetic.main.rv_item_rectangle.view.*

class RectangleViewHolder(view: View): BaseViewHolder<Person>(view) {

    override fun bind(model: Person) {
        itemView.tv_name.text = model.name
        itemView.tv_age.text = model.age.toString()
    }
}