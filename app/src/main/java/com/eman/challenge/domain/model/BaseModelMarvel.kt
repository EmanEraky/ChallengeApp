package com.eman.challenge.domain.model

open class BaseModelMarvel(
    var id: Int? = null,
    var name: String? = null,
    var description: String? = null,
    var thumbnail: MarvelImage? = null,
    var title: String? = null,
)