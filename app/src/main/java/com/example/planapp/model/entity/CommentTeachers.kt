package com.example.planapp.model.entity

data class CommentTeachers(
    val id: Int,
    val commentText:String,
    val created_at: String,
    val teacherName: String,
    val department_id: Int?,
    val teacher_id: String?
)
