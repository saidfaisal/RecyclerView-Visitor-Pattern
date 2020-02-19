package com.example.recyclerviewvisitorpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewvisitorpattern.model.Fruit
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listData = mutableListOf<Visitable>()
        listData.add(Fruit("apple", "red", R.drawable.apple))
        listData.add(Fruit("nanas", "yellow", R.drawable.apple))

        val typeFactory = ItemTypeFactory()
        val multiRecyclerAdapter = RecyclerViewAdapter(listData,typeFactory)
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        recyclerView.adapter = multiRecyclerAdapter
        recyclerView.layoutManager = linearLayoutManager
    }
}
