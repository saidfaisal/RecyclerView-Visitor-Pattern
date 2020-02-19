package com.example.recyclerviewvisitorpattern

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<T>(view: View): RecyclerView.ViewHolder(view) {
    private var views: HashMap<Int?, View?>? = null
    private var mItemView: View? = null

    init {
        mItemView = itemView
        views = HashMap()
    }

    fun getView(resId: Int): View? {
        views.let {
            val view = it?.get(resId)
            views?.put(resId, view)
            return view
        }
    }
    abstract fun bind(model: T)
}