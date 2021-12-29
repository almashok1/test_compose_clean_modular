package kz.technodom.base.models

import com.example.arch.api.SerializedName

data class ServerErrorBody(
    @SerializedName( "status")
    val status: String?,
    @SerializedName("code")
    val code: Int,
    @SerializedName("message")
    val message: String?
)
