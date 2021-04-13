package com.eman.challenge.data.repo

import com.eman.challenge.domain.model.MarvelDetailsCharacterData
import com.eman.challenge.utils.Resource
import kotlinx.coroutines.flow.Flow

interface ApiDetailsHelper {
    suspend fun getCharacterDetails(id: Int): Flow<Resource<MarvelDetailsCharacterData>>


}