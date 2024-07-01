package com.example.planapp.model.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AdministratorDto(

    @SerialName("id")
    val id: String,

    @SerialName("name")
    val name: String,

    @SerialName("phone")
    val phone: String?,

    @SerialName("email")
    val email: String,

    @SerialName("created_at")
    val created_at: String,

    @SerialName("department_id")
    val department_id: Int?
)
