package com.example.arch.models

data class ResponseErrorParams(
    val code: Int,
    val url: String? = null,
    val errorBody: String? = null
)
