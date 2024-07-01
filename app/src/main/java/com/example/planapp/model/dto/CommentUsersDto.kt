package com.example.planapp.model.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CommentUsersDto(

    @SerialName("id")
    val id: Int,

    @SerialName("commentText")
    val commentText:String,

    @SerialName("created_at")
    val created_at: String,

    @SerialName("userName")
    val userName: String,

    @SerialName("department_id")
    val department_id: Int?,

    @SerialName("user_id")
    val user_id: String?
)