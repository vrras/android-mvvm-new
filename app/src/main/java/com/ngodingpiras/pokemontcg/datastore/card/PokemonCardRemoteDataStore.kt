package com.ngodingpiras.pokemontcg.datastore.card

import com.ngodingpiras.pokemontcg.model.PokemonCard
import com.ngodingpiras.pokemontcg.services.ServiceApp
import java.lang.Exception

class PokemonCardRemoteDataStore(private val serviceApp: ServiceApp) : PokemonCardDataStore {
    override suspend fun getPokemons(set: String): MutableList<PokemonCard>? {
        val response = serviceApp.getCards(set)
        if (response.isSuccessful) return  response.body()?.cards

        throw Exception("Terjadi kesalahan saat melakukan request data, status error ${response.code()}")
    }

    override suspend fun addAll(set: String, pokemons: MutableList<PokemonCard>?) {
    }

}