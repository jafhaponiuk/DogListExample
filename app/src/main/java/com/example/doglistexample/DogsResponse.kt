package com.example.doglistexample

import com.google.gson.annotations.SerializedName

//JSON to dataclass parse
data class DogsResponse(
    @SerializedName("status") var status: String,
    @SerializedName("message") var images: List<String>
)