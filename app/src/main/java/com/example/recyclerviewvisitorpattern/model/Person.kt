package com.example.recyclerviewvisitorpattern.model

import com.example.recyclerviewvisitorpattern.ViewHolderTypeFactory
import com.example.recyclerviewvisitorpattern.Visitable

class Person(val name: String, val age: Int): Visitable {

    override fun type(typeFactory: ViewHolderTypeFactory):Int {
        return typeFactory.type(this)
    }
}