package com.example.planapp.repository

import com.example.planapp.model.dto.ClassroomDto
import com.example.planapp.model.entity.Classroom

interface ClassroomRepository {
    suspend fun createClassroom(classroom: Classroom): Boolean
    suspend fun getClassroom(id: Int): ClassroomDto
    suspend fun getClassrooms(): List<ClassroomDto>?
}