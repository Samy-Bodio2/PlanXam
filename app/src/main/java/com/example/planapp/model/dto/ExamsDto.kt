package com.example.planapp.model.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ExamsDto(

    @SerialName("idExam")
    val idExam: Int,

    @SerialName("start_Date")
    val start_Date: String,

    @SerialName("end_Date")
    val end_Date: String,

    @SerialName("created_at")
    val created_at: String
)
