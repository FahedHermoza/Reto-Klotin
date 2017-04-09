package com.devart.fahed.developer.trainingappklotin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.view_item.view.*

/**
 * Created by mac on 8/04/17.
 */
class ItemAdapter (val items: List<Item>, val listener: (Item) -> Unit ): RecyclerView.Adapter <ItemAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return ViewHolder(parent.inflate(R.layout.view_item))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = with(holder.itemView){

        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val item = items[position]
        item_title.text = item.title
        item_image.loadUrl(item.url)
        setOnClickListener {listener(item)}
    }

    override fun getItemCount() = items.size


    class ViewHolder(view : View) : RecyclerView.ViewHolder(view)

}