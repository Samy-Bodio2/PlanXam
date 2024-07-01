package com.example.planapp.model.entity

data class Users(
    val idUser: String,
    val name: String,
    val username: String,
    val identifier: String,
    val password: String,
    val phone: String,
    val email: String,
    val created_at: String,
    val id_classroom: Int?
)
