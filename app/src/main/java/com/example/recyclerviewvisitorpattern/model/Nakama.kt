package com.example.recyclerviewvisitorpattern.model

import com.example.recyclerviewvisitorpattern.ViewHolderTypeFactory
import com.example.recyclerviewvisitorpattern.Visitable

class Nakama(val name: String): Visitable {

    override fun type(typeFactory: ViewHolderTypeFactory): Int {
        return typeFactory.type(this)
    }
}