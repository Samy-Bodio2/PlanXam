package com.example.planapp.repository

import com.example.planapp.model.dto.CommentTeachersDto
import com.example.planapp.model.entity.CommentTeachers

interface CommentTeacherRepository {
    suspend fun createCommentTeacher(commentTeacher: CommentTeachers): Boolean
    suspend fun getCommentsTeacher(): List<CommentTeachersDto>?
    suspend fun getCommentTeacher(id: Int): CommentTeachersDto
    suspend fun deleteCommentTeacher(id: Int)
}