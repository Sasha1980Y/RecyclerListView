package com.example.alexanderyakovenko.recyclerlistview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.graphics.drawable.Drawable



/**
 * Created by alexanderyakovenko on 3/28/18.
 */
class ListRecyclerViewAdapter(val list: ArrayList<Things>): RecyclerView.Adapter<ListSelectionViewHolder>() {

    //val list = arrayListOf("Item 1", "Item 2", "Item 3")

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ListSelectionViewHolder?, position: Int) {

        if (holder != null) {
            //holder.listPosition.text = (position + 1).toString()
            holder.listPosition.text = list[position].name
            holder.listTitle.text = list[position].price


            list[position].image?.let { image ->
                holder.listImage.setImageResource(image)
            }


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ListSelectionViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.list_selection_view_holder, parent, false)
        return ListSelectionViewHolder(view)
    }


}