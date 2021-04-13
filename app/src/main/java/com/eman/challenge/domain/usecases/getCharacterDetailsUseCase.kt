package com.eman.challenge.domain.usecases

import com.eman.challenge.data.repo.ApiDetailsHelper
import javax.inject.Inject

class getCharacterDetailsUseCase @Inject constructor(private val apiDetailsHelper: ApiDetailsHelper) {

    suspend fun characterDetails(id:Int) = apiDetailsHelper.getCharacterDetails(id)


}
