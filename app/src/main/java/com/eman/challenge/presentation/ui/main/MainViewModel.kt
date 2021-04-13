package com.eman.challenge.presentation.ui.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.eman.challenge.domain.model.MarvelCharacterData
import com.eman.challenge.domain.usecases.getCharactersUseCase
import com.eman.challenge.utils.NetworkHelper
import com.eman.challenge.utils.Resource
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor
    (val mainRepositoryUseCase: getCharactersUseCase, val networkHelper: NetworkHelper) :
    ViewModel() {
    private val _characters = MutableLiveData<Resource<MarvelCharacterData>>()
    val characters: MutableLiveData<Resource<MarvelCharacterData>>
        get() = _characters


    private val _nCharacters = MutableLiveData<Resource<MarvelCharacterData>>()
    val nCharacters: MutableLiveData<Resource<MarvelCharacterData>>
        get() = _nCharacters

    init {
        getCharactersResponse(0, 10)
    }

    fun getCharactersResponse(offset: Int, limit: Int) {
        viewModelScope.launch {
            _characters.postValue(Resource.loading(null))
            if (networkHelper.isNetworkConnected()) {
                mainRepositoryUseCase.getCharacters(offset, limit).collect {
                    _characters.postValue(it)
                }
            } else _characters.postValue(Resource.error("No internet connection", null))
        }
    }

    fun getCharactersBeginLetter(limit: Int, name: String) {
        viewModelScope.launch {
            _nCharacters.postValue(Resource.loading(null))
            if (networkHelper.isNetworkConnected()) {
                mainRepositoryUseCase.getCharactersBeginLetter(limit, name).collect {
                    _nCharacters.postValue(it)
                }
            } else _nCharacters.postValue(Resource.error("No internet connection", null))
        }
    }

}