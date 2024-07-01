package com.example.planapp.model.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UsersDto(

    @SerialName("idUser")
    val idUser: String,

    @SerialName("name")
    val name: String,

    @SerialName("username")
    val username: String,

    @SerialName("identifier")
    val identifier: String,

    @SerialName("password")
    val password: String,

    @SerialName("phone")
    val phone: String,

    @SerialName("email")
    val email: String,

    @SerialName("created_at")
    val created_at: String,

    @SerialName("id_classroom")
    val id_classroom: Int?
)
