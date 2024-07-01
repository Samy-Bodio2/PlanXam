package com.example.planapp.model.dto

import com.example.planapp.model.entity.utils.SchoolLevel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SectorDto(

    @SerialName("id")
    val id: String,

    @SerialName("name")
    val name: String,

    @SerialName("level")
    val level: SchoolLevel,

    @SerialName("Id_Department")
    val Id_Department: Int?
)
