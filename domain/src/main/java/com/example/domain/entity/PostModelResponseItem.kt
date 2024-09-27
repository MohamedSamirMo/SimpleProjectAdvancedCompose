package com.example.domain.entity

// To parse the JSON, install kotlin's serialization plugin and do: Model = Json.decodeFromString(jsonString)
data class PostModelResponseItem(
    val body: String,
    val id: Int,
    val title: String,
    val userId: Int
)