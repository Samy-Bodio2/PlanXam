package com.example.planapp.repository

import com.example.planapp.model.dto.NotificationDto
import com.example.planapp.model.entity.Notification

interface NotificationRepository {
    suspend fun createNotification(notification: Notification): Boolean
    suspend fun getNotification(id :Int): NotificationDto
    suspend fun getNotifications(): List<NotificationDto>
    suspend fun deleteNotification(id: Int)
}