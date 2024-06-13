package com.example.planapp.model.staticData

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.example.planapp.R

class SchoolRepo {
    @Composable
    fun getAllData(): List<School>{
        return listOf(
            School(
                Image = painterResource(id = R.drawable.icia),
                Name = "ICIA",
                Description = "Institut de Commerce et d’Ingénierie d’Affaire"
            ),
            School(
                Image = painterResource(id = R.drawable.l3iac),
                Name = "3IAC",
                Description = "’Institut d’Ingénierie Informatique d’Afrique centrale"
            ),
            School(
                Image = painterResource(id = R.drawable.istdi),
                Name = "ISTDI",
                Description = "Institut Supérieur de Technologie et du Design Industriel"
            ),
            School(
                Image = painterResource(id = R.drawable.icia),
                Name = "ICIA",
                Description = "Institut de Commerce et d’Ingénierie d’Affaire"
            ),
            School(
                Image = painterResource(id = R.drawable.l3iac),
                Name = "3IAC",
                Description = "’Institut d’Ingénierie Informatique d’Afrique centrale"
            ),
            School(
                Image = painterResource(id = R.drawable.istdi),
                Name = "ISTDI",
                Description = "Institut Supérieur de Technologie et du Design Industriel"
            ),
            School(
                Image = painterResource(id = R.drawable.seas),
                Name = "SEAS",
                Description = "School of Engineering & Applied Sciences"
            ),
            School(
                Image = painterResource(id = R.drawable.pisti),
                Name = "SEAS",
                Description = "Programme Internationaux des Sciences et Technologies de l’Innovation"
            )
        )
    }

    class School(var Image: Painter, var Name: String,var Description: String)
}