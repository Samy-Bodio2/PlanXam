package com.example.planapp.repository

import com.example.planapp.model.dto.UsersDto
import com.example.planapp.model.entity.Users

interface UserRepository {
    suspend fun createUser(users: Users) : Boolean
    suspend fun getUsers(): List<UsersDto>?
    suspend fun getUser(id: String) : UsersDto
    suspend fun updateUser(
        name: String?,
        username: String?,
        identifier: String?,
        password: String?,
        phone: String?,
        email: String?
    )
}