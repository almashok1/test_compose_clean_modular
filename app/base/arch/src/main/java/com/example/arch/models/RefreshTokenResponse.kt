package kz.technodom.base.models

import com.example.arch.api.SerializedName

data class RefreshTokenResponse(
    @SerializedName("access_token")
    val accessToken: String?,
    @SerializedName("refresh_token")
    val refreshToken: String?,
    @SerializedName("status")
    val status: String?
)
