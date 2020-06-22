package com.ngodingpiras.pokemontcg.datastore.set

import com.ngodingpiras.pokemontcg.model.PokemonSet
import com.ngodingpiras.pokemontcg.services.ServiceApp

class PokemonSetRemoteDataStore(private val serviceApp: ServiceApp) :
    PokemonSetDataStore {
    override suspend fun getSets(): MutableList<PokemonSet>? {
        val response = serviceApp.getSets()
        if (response.isSuccessful) return response.body()?.sets

        throw Exception("Terjadi kesalahan saat melakukan request data, status error ${response.code()}")
    }

    override suspend fun addAll(sets: MutableList<PokemonSet>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}