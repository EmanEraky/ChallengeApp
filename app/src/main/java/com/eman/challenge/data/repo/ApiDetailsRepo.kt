package com.eman.challenge.data.repo

import com.eman.challenge.data.api.ApiService
import com.eman.challenge.domain.model.MarvelDetailsCharacterData
import com.eman.challenge.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class ApiDetailsRepo @Inject constructor(private val apiService: ApiService) : ApiDetailsHelper {


    override suspend fun getCharacterDetails(id: Int): Flow<Resource<MarvelDetailsCharacterData>> {

        return flow {
            emit(Resource.loading(null))
            val resource = try {
                val character = apiService.getCharacter(id)
                Resource.success(character)
            } catch (e: Throwable) {
                Resource.error(e.toString(), null)
            }
            emit(resource)
        }
    }


}