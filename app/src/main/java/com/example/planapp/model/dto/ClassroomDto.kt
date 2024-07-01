package com.example.planapp.model.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ClassroomDto(

    @SerialName("id")
    val id: Int,

    @SerialName("name")
    val name: String,

    @SerialName("capacity")
    val capacity: Int,

    @SerialName("created_at")
    val created_at: String?
)
