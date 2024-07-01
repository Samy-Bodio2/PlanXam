package com.example.planapp.model.entity

data class Administrator(
    val id: String,
    val name: String,
    val phone: String?,
    val email: String,
    val created_at: String,
    val department_id: Int?
)
