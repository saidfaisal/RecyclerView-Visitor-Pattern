package com.example.recyclerviewvisitorpattern

import android.view.View
import com.example.recyclerviewvisitorpattern.model.Fruit
import com.example.recyclerviewvisitorpattern.model.Nakama
import com.example.recyclerviewvisitorpattern.model.Person
import com.example.recyclerviewvisitorpattern.viewholder.CardViewHolder
import com.example.recyclerviewvisitorpattern.viewholder.RectangleViewHolder
import com.example.recyclerviewvisitorpattern.viewholder.TopViewHolder

class ItemTypeFactory: ViewHolderTypeFactory {
    override fun type(person: Person): Int {
        return ITEM_RECTANGLE
    }

    override fun type(nakama: Nakama): Int {
        return ITEM_TOP
    }

    override fun type(fruit: Fruit): Int {
        return ITEM_CARD
    }

    override fun create(type: Int, itemView: View): BaseViewHolder<*> {
        return when(type) {
            ITEM_CARD -> CardViewHolder(itemView)
            ITEM_RECTANGLE -> RectangleViewHolder(itemView)
            ITEM_TOP -> TopViewHolder(itemView)
            else -> throw RuntimeException("Illegal view type")
        }
    }

    companion object {
        const val ITEM_CARD = R.layout.rv_item_card
        const val ITEM_RECTANGLE = R.layout.rv_item_rectangle
        const val ITEM_TOP = R.layout.rv_item_top
    }
}