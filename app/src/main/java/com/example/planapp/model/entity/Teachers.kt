package com.example.planapp.model.entity

data class Teachers(
    val idTeacher: String,
    val name: String,
    val username: String,
    val identifier: String,
    val phone: String,
    val department_ID: Int?,
    val report_id: Int?
)
