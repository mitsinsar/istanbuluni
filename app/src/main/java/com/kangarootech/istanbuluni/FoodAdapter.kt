package com.kangarootech.istanbuluni

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter : RecyclerView.Adapter<FoodViewHolder>() {

    private val items = mutableListOf<Food>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        return FoodViewHolder.create(parent)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.bind(items[position])
    }

    fun setNewItems(newItems: List<Food>) {
        items.apply {
            clear()
            addAll(newItems)
        }
        notifyDataSetChanged()
    }
}
