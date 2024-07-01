package com.example.planapp.repository

import com.example.planapp.model.dto.Exam_TeachersDto
import com.example.planapp.model.dto.ExamsDto

interface ExamTeachersRepository {
    suspend fun createExamTeacher(examTeacherdto: Exam_TeachersDto): Boolean
    suspend fun deleteExamTeacher(id: Int)
}