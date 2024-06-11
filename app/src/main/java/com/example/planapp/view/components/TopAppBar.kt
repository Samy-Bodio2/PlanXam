package com.example.planapp.view.components

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.planapp.R
import com.example.planapp.ui.theme.MainGreen
import com.example.planapp.view.components.student.BottomAppBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun TopAppBar()
{
    Scaffold(modifier = Modifier.padding(12.dp),
        topBar = {
            Row(modifier = Modifier
                .height(90.dp)
                .padding(12.dp),verticalAlignment = Alignment.CenterVertically){
                Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(10.dp,Alignment.Start))
                {
                    Box(modifier = Modifier
                        .height(40.dp)
                        .width(40.dp)
                        .background(MainGreen, shape = RoundedCornerShape(50.dp)), contentAlignment = Alignment.Center)
                    {
                        Text(text = "S",color = Color.White, style = TextStyle(
                            fontSize = 20.sp,
                            fontFamily = FontFamily(Font(R.font.inika_bold)),
                            fontWeight = FontWeight(700))
                        )
                    }
                    Text(text = "Samy Bodio",color = MainGreen, style = TextStyle(
                        fontSize = 20.sp,
                        fontFamily = FontFamily(Font(R.font.inika_bold)),
                        fontWeight = FontWeight(700))
                    )
                }
                Row(modifier = Modifier.fillMaxWidth(),verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(10.dp,Alignment.End)){
                    Box(modifier = Modifier
                        .width(32.dp)
                        .height(32.dp))
                    {
                        Icon(painter = painterResource(id = R.drawable.logo), contentDescription = "", tint = MainGreen)
                    }
                    Box(modifier = Modifier
                        .width(35.dp)
                        .height(35.dp))
                    {
                        Icon(painter = painterResource(id = R.drawable.logo), contentDescription = "", tint = MainGreen)
                    }
                }
            }
        },
        bottomBar = {
            BottomAppBar()
        })
    {

    }
}

@Preview
@Composable
fun prevTopBar(){
    TopAppBar()
}