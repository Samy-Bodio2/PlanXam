package com.example.planapp.repository

import com.example.planapp.model.dto.TeachersDto
import com.example.planapp.model.entity.Teachers

interface TeacherRepository {
    suspend fun createTeacher(teacher: Teachers) : Boolean
    suspend fun getTeachers(): List<TeachersDto>?
    suspend fun getTeacher(id: String) : TeachersDto
    suspend fun updateTeacher(
        name: String?,
        username: String?,
        identifier: String?,
        phone: String?,
    )
}