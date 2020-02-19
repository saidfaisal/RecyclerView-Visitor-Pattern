package com.example.recyclerviewvisitorpattern

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(private var mData: List<Visitable>, private val typeFactory: ViewHolderTypeFactory): RecyclerView.Adapter<BaseViewHolder<Visitable>>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Visitable> {
        val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return typeFactory.create(viewType, view) as BaseViewHolder<Visitable>
    }

    override fun getItemCount(): Int {
        return mData.size
    }

    override fun getItemViewType(position: Int): Int {
        return mData[position].type(typeFactory)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<Visitable>, position: Int) {
        holder.bind(mData[position])
    }

}