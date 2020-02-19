package com.example.recyclerviewvisitorpattern

interface Visitable{
    fun type(typeFactory: ViewHolderTypeFactory): Int
}