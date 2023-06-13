package com.example.giftrainingapp_sl

import com.google.gson.annotations.SerializedName


data class Original(
    @SerializedName("url") val url: String
)

data class Images(
    @SerializedName("original") val original: Original?
)

data class ItemGif(
    @SerializedName("id") val id: String,
    @SerializedName("images") val images: Images?
)