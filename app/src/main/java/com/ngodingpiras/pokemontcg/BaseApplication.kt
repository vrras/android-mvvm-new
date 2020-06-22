package com.ngodingpiras.pokemontcg

import android.app.Application
import com.ngodingpiras.pokemontcg.database.AppDatabase
import com.ngodingpiras.pokemontcg.datastore.card.PokemonCardRemoteDataStore
import com.ngodingpiras.pokemontcg.datastore.card.PokemonCardRoomDataStore
import com.ngodingpiras.pokemontcg.repositories.PokemonCardRepository
import com.ngodingpiras.pokemontcg.datastore.set.PokemonSetRemoteDataStore
import com.ngodingpiras.pokemontcg.datastore.set.PokemonSetRoomDataStore
import com.ngodingpiras.pokemontcg.repositories.PokemonSetRepository
import com.ngodingpiras.pokemontcg.services.NetworkApp

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        val service = NetworkApp.SERVICE_APP
        val appDatabase = AppDatabase.getInstance(this)
        PokemonSetRepository.instance.apply {
            init(PokemonSetRoomDataStore(appDatabase.pokemonSetDao()), PokemonSetRemoteDataStore(service))
        }

        PokemonCardRepository.instance.apply {
            init(PokemonCardRoomDataStore(appDatabase.pokemonCardDao()), PokemonCardRemoteDataStore(service))
        }
    }
}