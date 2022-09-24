package com.danzucker.ocadoproducts.business.datasource.remote.model

import com.google.gson.annotations.SerializedName

data class ProductItemsDto(
    @SerializedName("id")
    val id : String,
    @SerializedName("price")
    val price : String,
    @SerializedName("title")
    val title : String,
    @SerializedName("size")
    val size : String,
    @SerializedName("imageUrl")
    val imageUrl : String,
)