package com.example.planapp.model.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Exam_TeachersDto(

    @SerialName("id")
    val id: Int,

    @SerialName("id_exam")
    val id_exam: Int?,

    @SerialName("id_Teacher")
    val id_Teacher: String?
)
