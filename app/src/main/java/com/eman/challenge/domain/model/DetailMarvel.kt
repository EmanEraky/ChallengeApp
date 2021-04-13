package com.eman.challenge.domain.model

open class DetailMarvel(
    val comics: ItemsMarvel? = null,
    val series: ItemsMarvel? = null,
    val stories: ItemsMarvel? = null,
    val events: ItemsMarvel? = null,
): BaseModelMarvel()