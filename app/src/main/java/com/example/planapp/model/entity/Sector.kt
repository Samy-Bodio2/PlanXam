package com.example.planapp.model.entity

import com.example.planapp.model.entity.utils.SchoolLevel

data class Sector(
    val id: String,
    val name: String,
    val level: SchoolLevel,
    val Id_Department: Int?
)
