package com.eman.challenge.domain.usecases

import com.eman.challenge.data.repo.ApiHelper
import javax.inject.Inject

class getCharactersUseCase @Inject constructor(private val apiHelper: ApiHelper) {

    suspend fun getCharacters(offset: Int, limit: Int) =
        apiHelper.getCharacters(offset, limit)


    suspend fun getCharactersBeginLetter(limit: Int, name: String) =
        apiHelper.getCharactersBeginLetter(limit, name)
}