package com.example.planapp.model.dto

import com.example.planapp.model.entity.utils.ImportanceLevel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class NotificationDto(

    @SerialName("id")
    val id: Int,

    @SerialName("text")
    val text: String,

    @SerialName("content")
    val content: String,

    @SerialName("importance")
    val importance: ImportanceLevel,

    @SerialName("admin_id")
    val admin_id: String?,

    @SerialName("created_at")
    val created_at: String
)
