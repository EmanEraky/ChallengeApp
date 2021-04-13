package com.eman.challenge.presentation.ui.detail

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.eman.challenge.domain.model.MarvelDetailsCharacterData
import com.eman.challenge.domain.usecases.getCharacterDetailsUseCase
import com.eman.challenge.utils.NetworkHelper
import com.eman.challenge.utils.Resource
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class DetailsViewModel @ViewModelInject constructor(
    var detailsUseCase: getCharacterDetailsUseCase, val networkHelper: NetworkHelper,
) : ViewModel() {


    private val _business = MutableLiveData<Resource<MarvelDetailsCharacterData>>()
    var id = 0
    val character: MutableLiveData<Resource<MarvelDetailsCharacterData>>
        get() = _business


    fun getDetailsBusiness(id: Int) {
        viewModelScope.launch {
            if (networkHelper.isNetworkConnected()) {
                detailsUseCase.characterDetails(id).collect {
                    _business.postValue(it)
                }
            } else {
                _business.postValue(Resource.error("No internet connection", null))
            }

        }
    }

}