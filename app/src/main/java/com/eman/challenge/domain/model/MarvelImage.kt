package com.eman.challenge.domain.model

data class MarvelImage(
    val path: String? = null,
    val extension: String? = null) {

    fun getPathExtension(): String {
        return path + "." + extension
    }
}