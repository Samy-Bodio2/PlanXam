package com.example.planapp.view.supervisor

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowUpward
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.planapp.ui.theme.FillWhite
import com.example.planapp.ui.theme.MainGreen
import com.example.planapp.ui.theme.Typography
import com.example.planapp.view.components.TopAppBAr
import com.example.planapp.view.components.student.BottomAppBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ReportScreen(){
    Scaffold(modifier = Modifier.padding(paddingValues = PaddingValues(12.dp)),
        topBar = { ReportBar() },
        content = {
            BodyReportScreen()
        },
        bottomBar = { BottomAppBar()}
    )
}

@Composable
fun ReportBar(){
    Column(modifier = Modifier.fillMaxSize()){
        TopAppBAr()
        Row (modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(FillWhite),
            verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
            Text("Write a report to the administration",style = Typography.titleLarge,color = MainGreen);
        }
    }
}


@Composable
fun BodyReportScreen(){
    var textReport by remember {
        mutableStateOf("")
    }
    Column(modifier = Modifier.fillMaxSize().padding(bottom = 30.dp),verticalArrangement = Arrangement.spacedBy(17.dp)){
        Button(onClick = { /*TODO*/ },modifier = Modifier
            .fillMaxWidth()
            .padding(top = 170.dp)
            .border(1.dp, color = MainGreen, shape = RoundedCornerShape(20.dp)),colors = ButtonDefaults.buttonColors(containerColor = FillWhite)) {
            Text("View all your report",style = Typography.titleLarge,color = MainGreen)
            Spacer(modifier = Modifier.width(10.dp))
            Icon(imageVector = Icons.Default.ArrowUpward, contentDescription = "",tint = MainGreen)
        }
        Box(contentAlignment = Alignment.BottomEnd) {
            OutlinedTextField(value = textReport, onValueChange ={
                textReport = it
            }, placeholder = { Text(text = "Enter your preoccupation", style = Typography.titleLarge, fontSize = 19.sp,modifier = Modifier.padding(10.dp))}, maxLines = 10
                ,modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.85f)
                    .background(color = FillWhite, shape = RoundedCornerShape(30.dp)),shape = RoundedCornerShape(30.dp),
                colors = TextFieldDefaults.colors(unfocusedIndicatorColor = MainGreen,focusedIndicatorColor = MainGreen ,unfocusedContainerColor = FillWhite, focusedContainerColor= FillWhite))
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Send, contentDescription = "",modifier= Modifier.padding(end = 7.dp, bottom = 7.dp),tint = MainGreen)
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PrevReportSCreen(){
    ReportScreen()
}