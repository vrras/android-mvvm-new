package com.ngodingpiras.pokemontcg.datastore.card

import com.ngodingpiras.pokemontcg.model.PokemonCard

interface PokemonCardDataStore {
    suspend fun getPokemons(set: String): MutableList<PokemonCard>?
    suspend fun addAll(set: String, pokemons: MutableList<PokemonCard>?)
}