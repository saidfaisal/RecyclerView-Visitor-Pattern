package com.example.recyclerviewvisitorpattern

import android.view.View
import com.example.recyclerviewvisitorpattern.model.Fruit
import com.example.recyclerviewvisitorpattern.model.Nakama
import com.example.recyclerviewvisitorpattern.model.Person

interface ViewHolderTypeFactory {
    fun type(person: Person): Int
    fun type(nakama: Nakama): Int
    fun type(fruit: Fruit): Int

    fun create(type: Int, itemView: View): BaseViewHolder<*>
}