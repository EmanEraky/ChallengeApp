package com.eman.challenge.data.repo

import com.eman.challenge.data.api.ApiService
import com.eman.challenge.domain.model.MarvelCharacterData
import com.eman.challenge.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetCharactersRepo @Inject constructor(private val apiService: ApiService) : ApiHelper {

    override suspend fun getCharacters(
        offset: Int,
        limit: Int
    ): Flow<Resource<MarvelCharacterData>> {
        return flow {
            emit(Resource.loading(null))
            val resource = try {
                val character = apiService.getCharacters(offset, limit)
                Resource.success(character)
            } catch (e: Throwable) {
                Resource.error(e.toString(), null)
            }
            emit(resource)
        }
    }

    override suspend fun getCharactersBeginLetter(
        limit: Int,
        name: String
    ): Flow<Resource<MarvelCharacterData>> {
        return flow {
            emit(Resource.loading(null))
            val resource = try {
                val character = apiService.getCharactersBeginLetter(limit, name)
                Resource.success(character)
            } catch (e: Throwable) {
                Resource.error(e.toString(), null)
            }
            emit(resource)
        }
    }
}