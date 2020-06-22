package com.ngodingpiras.pokemontcg.datastore.card

import com.ngodingpiras.pokemontcg.model.PokemonCard

class PokemonCardLocalDataStore : PokemonCardDataStore {
    private val caches = mutableMapOf<String, MutableList<PokemonCard>?>()

    override suspend fun getPokemons(set: String): MutableList<PokemonCard>? =
        if (caches.contains(set)) caches[set] else null

    override suspend fun addAll(set: String, pokemons: MutableList<PokemonCard>?) {
        caches[set] = pokemons
    }


}