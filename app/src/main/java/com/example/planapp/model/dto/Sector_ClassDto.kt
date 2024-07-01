package com.example.planapp.model.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Sector_ClassDto(

    @SerialName("id")
    val id: Int,

    @SerialName("idClassRoom")
    val idClassRoom: Int?,

    @SerialName("idSector")
    val idSector: String?
)
