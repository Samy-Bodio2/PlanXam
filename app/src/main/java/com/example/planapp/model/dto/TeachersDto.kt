package com.example.planapp.model.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TeachersDto(

    @SerialName("idTeacher")
    val idTeacher: String,

    @SerialName("name")
    val name: String,

    @SerialName("username")
    val username: String,

    @SerialName("identifier")
    val identifier: String,

    @SerialName("phone")
    val phone: String,

    @SerialName("department_ID")
    val department_ID: Int?,

    @SerialName("report_id")
    val report_id: Int?
)
