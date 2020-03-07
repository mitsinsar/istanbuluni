package com.kangarootech.istanbuluni

import com.google.gson.annotations.SerializedName

data class FoodItems(
    @SerializedName("items") val items: List<Food>?,
    @SerializedName("kahvalti") val breakfast: List<Food>?,
    @SerializedName("ogle") val lunch: List<Food>?,
    @SerializedName("aksam") val dinner: List<Food>?,
    @SerializedName("kumanya") val stores: List<Food>?,
    @SerializedName("diyet") val diet: List<Food>?,
    @SerializedName("vegan") val vegan: List<Food>?,
    @SerializedName("cocuk") val child: List<Food>?
)

data class FoodResponse(
    @SerializedName("Data") val data: String
)
