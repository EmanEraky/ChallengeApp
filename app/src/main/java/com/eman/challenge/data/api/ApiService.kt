package com.eman.challenge.data.api

import com.eman.challenge.domain.model.MarvelDetailsCharacterData
import com.eman.challenge.domain.model.MarvelCharacterData
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("characters")
    suspend   fun getCharacters( @Query("offset") offset: Int , @Query("limit") limit: Int):
            MarvelCharacterData

    @GET("characters")
    suspend   fun getCharactersBeginLetter(@Query("limit") limit: Int, @Query("nameStartsWith") letter: String): MarvelCharacterData

    @GET("characters/{characterId}")
    suspend  fun getCharacter(@Path("characterId") characterId: Int?): MarvelDetailsCharacterData

}