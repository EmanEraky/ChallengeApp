package com.eman.challenge.domain.model

data class MarvelDataContainer(
    val results: MutableList<BaseModelMarvel> = mutableListOf()
) : BaseMarvelData()