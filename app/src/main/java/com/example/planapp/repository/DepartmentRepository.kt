package com.example.planapp.repository

import com.example.planapp.model.dto.DepartmentDto

interface DepartmentRepository {
    suspend fun getDepartment(id: String): DepartmentDto
    suspend fun getDepartments(): List<DepartmentDto>?
}