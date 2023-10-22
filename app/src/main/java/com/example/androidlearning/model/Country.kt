package com.example.androidlearning.model

import com.google.gson.annotations.SerializedName

data class Country(
    @SerializedName("countryName")
    val countryName: String,
    @SerializedName("capital")
    val capital: String,
    @SerializedName("flag")
    val flag: String
)
