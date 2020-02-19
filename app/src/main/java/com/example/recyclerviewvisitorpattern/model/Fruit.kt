package com.example.recyclerviewvisitorpattern.model

import com.example.recyclerviewvisitorpattern.ViewHolderTypeFactory
import com.example.recyclerviewvisitorpattern.Visitable

class Fruit(val name: String, val color: String, val resPicture: Int): Visitable {

    override fun type(typeFactory: ViewHolderTypeFactory): Int {
        return typeFactory.type(this)
    }

}