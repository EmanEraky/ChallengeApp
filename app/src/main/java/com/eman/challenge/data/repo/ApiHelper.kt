package com.eman.challenge.data.repo

import com.eman.challenge.domain.model.MarvelCharacterData
import com.eman.challenge.utils.Resource
import kotlinx.coroutines.flow.Flow

interface ApiHelper {
    suspend fun getCharacters(offset: Int, limit: Int): Flow<Resource<MarvelCharacterData>>

    suspend fun getCharactersBeginLetter(limit: Int, name: String): Flow<Resource<MarvelCharacterData>>


}