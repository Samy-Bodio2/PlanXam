package com.example.planapp.repository

import com.example.planapp.model.dto.ExamsDto
import com.example.planapp.model.entity.Exams

interface ExamRepository {
    suspend fun createExam(exam: Exams): Boolean
    suspend fun getExams(): List<ExamsDto>?
    suspend fun getExam(id: Int): ExamsDto
    suspend fun deleteExam(id: Int)
}