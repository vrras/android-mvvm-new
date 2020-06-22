package com.ngodingpiras.pokemontcg.services

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkApp {
    private const val BASE_URL = "https://api.pokemontcg.io/v1/"

    private val client = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val SERVICE_APP: ServiceApp = client.create(
        ServiceApp::class.java)
}