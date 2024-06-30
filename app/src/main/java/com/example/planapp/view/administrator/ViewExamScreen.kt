package com.example.planapp.view.administrator


import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DeleteOutline
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.planapp.ui.theme.FillWhite
import com.example.planapp.ui.theme.MainGreen
import com.example.planapp.ui.theme.Typography
import com.example.planapp.view.components.TopAppBAr
import com.example.planapp.view.components.administrator.BottomAppBarA
import com.example.planapp.view.student.InfoSect

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ViewExamScreen(){
    Scaffold(
        Modifier
            .padding(12.dp)
            .background(Color.White),
        topBar = {
            Column {
                TopAppBAr()
                InfoSect("You have 4 active exams")
            }
        },
        content = {
            BodyView()
        },
        bottomBar = {
            BottomAppBarA()
        }
    )
}


@Composable
fun BodyView(){
    LazyColumn(verticalArrangement = Arrangement.Center, horizontalAlignment =  Alignment.CenterHorizontally
        ,modifier = Modifier.fillMaxSize(),contentPadding = PaddingValues(vertical = 150.dp)
    ) {
        items(8){
            Row(modifier = Modifier
                .fillMaxWidth(0.9f)
                .height(80.dp)
                .shadow(elevation = 4.dp, spotColor = Color.Black, ambientColor = Color.Black)
                .background(
                    FillWhite, shape = RoundedCornerShape(3.dp)
                ),
                horizontalArrangement = Arrangement.SpaceBetween)
            {
                Column {
                    Text(text = "SN 2 SEMESTRE Dschang",style = Typography.labelSmall,color = MainGreen,fontSize = 15.sp,
                        modifier = Modifier.padding(start = 9.dp,top = 13.dp,end = 7.dp,bottom=8.dp))
                    Row {
                        Box(modifier = Modifier
                            .padding(start = 9.dp, top = 7.dp, end = 11.dp)
                            .background(Color.Red, shape = RoundedCornerShape(20.dp))
                            .size(10.dp))
                        Text(text = "Status . 26/06/2024 - 30/06/2024",style = Typography.labelSmall, fontSize = 13.sp,fontWeight = FontWeight.Normal)
                    }
                }
                Box (modifier = Modifier.fillMaxHeight(), contentAlignment = Alignment.Center){
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Default.DeleteOutline, contentDescription = "",tint = Color.Red)
                    }
                }
            }
            Spacer(modifier = Modifier.size(20.dp))
        }
    }
}


@Preview
@Composable
fun PrevViewExam(){
    ViewExamScreen()
}