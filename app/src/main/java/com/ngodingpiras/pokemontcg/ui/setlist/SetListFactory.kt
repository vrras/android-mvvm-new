package com.ngodingpiras.pokemontcg.ui.setlist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ngodingpiras.pokemontcg.repositories.PokemonSetRepository

class SetListFactory(
    private val setRepository: PokemonSetRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SetListViewModel::class.java))
            return SetListViewModel(setRepository) as T
        throw IllegalArgumentException()
    }
}