package com.example.planapp.repository

import com.example.planapp.model.dto.ReportDto
import com.example.planapp.model.entity.Report

interface ReportRepository {
   suspend fun createReport(report: Report): Boolean
   suspend fun getReport(id: Int): ReportDto
   suspend fun getReports(): List<ReportDto>?
}