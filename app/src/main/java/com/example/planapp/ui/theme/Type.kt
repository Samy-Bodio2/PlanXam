package com.example.planapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.planapp.R

// Set of Material typography styles to start with

val InikaBoldFontFamily = FontFamily(
        Font(R.font.inika_bold, FontWeight.Normal)
)


val Typography = Typography(

        bodyLarge = TextStyle(
                fontFamily = InikaBoldFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp
        ),
    titleLarge = TextStyle(
            fontFamily = InikaBoldFontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            color = Color(0xFFD8D8D8)
    )/*
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)