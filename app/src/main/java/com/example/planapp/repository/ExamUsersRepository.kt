package com.example.planapp.repository

import com.example.planapp.model.dto.Exam_TeachersDto
import com.example.planapp.model.dto.Exam_UsersDto
import com.example.planapp.model.dto.ExamsDto

interface ExamUsersRepository {
    suspend fun createExamUser(examUserdto: Exam_UsersDto): Boolean
    suspend fun deleteExamUser(id: Int)
}