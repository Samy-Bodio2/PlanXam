package com.example.planapp.repository

import com.example.planapp.model.dto.Sector_ClassDto
import com.example.planapp.model.entity.Sector_Class

interface Sector_ClassRepository {
    suspend fun createSectorClass(sectorClass: Sector_Class): Boolean
    suspend fun getSectorsClass(): List<Sector_ClassDto>?
}