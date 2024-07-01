package com.example.planapp.model.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DepartmentDto(

    @SerialName("id")
    val id: Int,

    @SerialName("name")
    val name: String,

    @SerialName("description")
    val description: String,

    @SerialName("thumbnail")
    val thumbnail: String
)
