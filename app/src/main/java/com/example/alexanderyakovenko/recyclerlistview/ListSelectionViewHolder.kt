package com.example.alexanderyakovenko.recyclerlistview

import android.support.v7.widget.RecyclerView
import android.view.TextureView
import android.view.View
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by alexanderyakovenko on 3/28/18.
 */
class ListSelectionViewHolder(itemView: View?): RecyclerView.ViewHolder(itemView) {
    val listPosition = itemView?.findViewById<TextView>(R.id.item_number) as TextView
    val listTitle = itemView?.findViewById<TextView>(R.id.itemString) as TextView
    val listImage = itemView?.findViewById<ImageView>(R.id.list_image_view) as ImageView


}