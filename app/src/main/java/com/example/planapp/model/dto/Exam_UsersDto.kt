package com.example.planapp.model.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Exam_UsersDto(

    @SerialName("id")
    val id: Int,

    @SerialName("id_exam")
    val id_exam: Int?,

    @SerialName("id_User")
    val id_User: String?
)