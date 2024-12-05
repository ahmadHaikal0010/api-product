package com.haikal.mi2a_api_product.service

import com.haikal.mi2a_api_product.model.ResponseProduk
import retrofit2.Call
import retrofit2.http.GET

interface ProdukService {
    @GET("products") // End Point
    fun getAllProduk(): Call<ResponseProduk>
}