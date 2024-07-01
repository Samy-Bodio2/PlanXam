package com.example.planapp.model.entity

import com.example.planapp.model.entity.utils.ImportanceLevel

data class Notification(
    val id: Int,
    val text: String,
    val content: String,
    val importance: ImportanceLevel,
    val admin_id: String?,
    val created_at: String
)
