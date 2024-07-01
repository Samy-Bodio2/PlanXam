package com.example.planapp.repository

import com.example.planapp.model.dto.CommentUsersDto
import com.example.planapp.model.entity.CommentUsers

interface CommentUserRepository {
    suspend fun createCommentUser(commentUser: CommentUsers): Boolean
    suspend fun getCommentsUser(): List<CommentUsersDto>?
    suspend fun getCommentUser(id: Int): CommentUsersDto
    suspend fun deleteCommentUser(id: Int)
}