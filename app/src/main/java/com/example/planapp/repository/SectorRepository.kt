package com.example.planapp.repository

import com.example.planapp.model.dto.SectorDto

interface SectorRepository {
    suspend fun getSectors(): List<SectorDto>?
    suspend fun getSector(id: String): SectorDto
}