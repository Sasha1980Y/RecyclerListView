package com.example.alexanderyakovenko.recyclerlistview

import android.content.Context
import android.media.Image
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.graphics.BitmapFactory
import android.graphics.Bitmap

class MainActivity : AppCompatActivity() {

    lateinit var listRecyclerView: RecyclerView
    var listThings: ArrayList<Things> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // fill array
        listThings = fillArray()

        // Adapter
        listRecyclerView = findViewById<RecyclerView>(R.id.list_recycler_view)
        listRecyclerView.layoutManager = LinearLayoutManager(this)
        listRecyclerView.adapter = ListRecyclerViewAdapter(listThings)


    }

    fun fillArray(): ArrayList<Things> {
        var array: ArrayList<Things> = ArrayList()
        var listItem1 = Things("Sasha", "1000", R.drawable.images )
        var listItem2 = Things("Vasya", "1100", R.drawable.empty )
        var listItem3 = Things("Kolya", "1200", R.drawable.images )
        var listItem4 = Things("Petya", "1300", R.drawable.empty )
        array.add(listItem1)
        array.add(listItem2)
        array.add(listItem3)
        array.add(listItem4)
        return array
    }

}
