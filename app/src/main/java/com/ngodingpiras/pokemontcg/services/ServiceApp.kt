package com.ngodingpiras.pokemontcg.services

import com.ngodingpiras.pokemontcg.model.PokemonCard
import com.ngodingpiras.pokemontcg.model.PokemonSet
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ServiceApp {
    @GET("cards")
    suspend fun getCards(@Query("set") set: String): Response<PokemonCard.PokemonCardResponse>

    @GET("sets")
    suspend fun getSets(): Response<PokemonSet.PokemonSetResponse>
}