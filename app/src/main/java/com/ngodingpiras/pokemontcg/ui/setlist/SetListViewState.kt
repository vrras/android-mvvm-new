package com.ngodingpiras.pokemontcg.ui.setlist

import com.ngodingpiras.pokemontcg.model.PokemonSet

data class SetListViewState (
    var loading: Boolean = false,
    var error: Exception? = null,
    var data: MutableList<PokemonSet>? = null
)