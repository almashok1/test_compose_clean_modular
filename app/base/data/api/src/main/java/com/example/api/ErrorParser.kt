package com.example.api

import com.example.arch.api.JsonSerializer
import com.example.arch.models.ServerErrorResponse
import com.example.arch.utils.fromJson

fun String?.parseResponseBodyError(serializer: JsonSerializer): String? {
    return if (this.isNullOrBlank()) null
    else {
        val errorBody = serializer.fromJson<ServerErrorResponse>(this)
        errorBody?.error?.message
    }
}