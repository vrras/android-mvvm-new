package com.ngodingpiras.pokemontcg.ui.main

import com.ngodingpiras.pokemontcg.model.PokemonSet

data class MainViewState (
    var loading: Boolean = false,
    var error: Exception? = null,
    var data: MutableList<PokemonSet>? = null
)