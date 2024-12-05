package com.haikal.mi2a_api_product.model

data class ModelProduk(
    val id: Int,
    val title: String,
    val description: String,
    val category: String,
    val price: Double,
    val brand: String,
    val stok: Int,
    val thumbnail: String,
)
