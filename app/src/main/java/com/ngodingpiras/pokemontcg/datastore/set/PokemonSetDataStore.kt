package com.ngodingpiras.pokemontcg.datastore.set

import com.ngodingpiras.pokemontcg.model.PokemonSet

interface PokemonSetDataStore {
    suspend fun getSets(): MutableList<PokemonSet>?
    suspend fun addAll(sets: MutableList<PokemonSet>?)
}