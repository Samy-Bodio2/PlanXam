package com.example.planapp.model.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CommentTeachersDto(

    @SerialName("id")
    val id: Int,

    @SerialName("commentText")
    val commentText:String,

    @SerialName("created_at")
    val created_at: String,

    @SerialName("teacherName")
    val teacherName: String,

    @SerialName("department_id")
    val department_id: Int?,

    @SerialName("teacher_id")
    val teacher_id: String?
)
