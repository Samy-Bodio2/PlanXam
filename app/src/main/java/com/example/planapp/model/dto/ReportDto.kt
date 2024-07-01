package com.example.planapp.model.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ReportDto(

    @SerialName("id")
    val id: Int,

    @SerialName("date")
    val date: String,

    @SerialName("pv")
    val pv: String,

    @SerialName("description")
    val description: String
)
