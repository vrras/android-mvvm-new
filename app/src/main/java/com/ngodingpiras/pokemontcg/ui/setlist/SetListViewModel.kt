package com.ngodingpiras.pokemontcg.ui.setlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ngodingpiras.pokemontcg.repositories.PokemonSetRepository
import kotlinx.coroutines.launch

class SetListViewModel(
    private val pokemonSets: PokemonSetRepository
) : ViewModel() {
    private val mViewState = MutableLiveData<SetListViewState>().apply {
        value = SetListViewState(loading = true)
    }
    val viewState: LiveData<SetListViewState>
        get() = mViewState

    init {
        getSets()
    }

    fun getSets() = viewModelScope.launch {
        try {
            val data = pokemonSets.getSets()
            mViewState.value = mViewState.value?.copy(loading = false, error = null, data = data)
        } catch (ex: Exception) {
            mViewState.value = mViewState.value?.copy(loading = false, error = ex, data = null)
        }
    }
}