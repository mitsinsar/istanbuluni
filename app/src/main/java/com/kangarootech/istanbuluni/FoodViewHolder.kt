package com.kangarootech.istanbuluni

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_food.view.*

class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val menuTextView = itemView.itemFoodMenu
    private val calorieTextView = itemView.itemFoodCalorie

    fun bind(food: Food) {
        menuTextView.text = food.menu
        calorieTextView.text = food.calorie
    }

    companion object {
        fun create(parent: ViewGroup): FoodViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_food, parent, false)
            return FoodViewHolder(view)
        }
    }
}
