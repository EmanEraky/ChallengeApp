package com.eman.challenge.domain.model

data class MarvelDetailsContainer(
    val results: MutableList<DetailMarvel> = mutableListOf()
) : BaseMarvelData()