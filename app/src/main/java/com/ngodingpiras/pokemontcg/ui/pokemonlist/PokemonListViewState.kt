package com.ngodingpiras.pokemontcg.ui.pokemonlist

import com.ngodingpiras.pokemontcg.model.PokemonCard

data class PokemonListViewState (
    val loading: Boolean = false,
    val error: Exception? = null,
    val data: MutableList<PokemonCard>? = null
)