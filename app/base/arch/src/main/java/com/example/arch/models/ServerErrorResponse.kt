package com.example.arch.models

import com.example.arch.api.SerializedName
import kz.technodom.base.models.ServerErrorBody

data class ServerErrorResponse(
    @SerializedName("error")
    val error: ServerErrorBody?
)