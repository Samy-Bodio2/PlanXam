package com.example.planapp.model.entity

data class CommentUsers(
    val id: Int,
    val commentText:String,
    val created_at: String,
    val userName: String,
    val department_id: Int?,
    val user_id: String?
)