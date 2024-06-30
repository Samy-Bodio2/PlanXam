package com.example.planapp.view.administrator

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.planapp.ui.theme.FillWhite
import com.example.planapp.ui.theme.Istdi_Green
import com.example.planapp.ui.theme.Istdi_Yellow
import com.example.planapp.ui.theme.MainGreen
import com.example.planapp.ui.theme.Typography
import com.example.planapp.view.components.TopAppBAr
import com.example.planapp.view.components.administrator.BottomAppBarA
import com.example.planapp.view.components.student.BottomAppBar
import com.example.planapp.view.components.supervisor.BottomAppBarT
import com.example.planapp.view.student.forums.messageSectionIstdi

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ViewReportScreen(){
    Scaffold(modifier = Modifier.padding(paddingValues = PaddingValues(12.dp)).background(Color.White),
        topBar = {
           TopAppBAr()
        },
        content = {
            ContentViewReport()
        },
        bottomBar = {
            Column {
                messageSection()
                BottomAppBarA()
            }
        }
    )
}

@Composable
fun messageSection(){
    var message by rememberSaveable {
        mutableStateOf("")
    }
    OutlinedTextField(
        placeholder = {
            Text("Type a message",style = Typography.titleLarge)
        },
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(FillWhite),
        value = message, onValueChange = { newText -> message = newText },
        trailingIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Send, contentDescription = "",tint = MainGreen)
            }
        },
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = Color.White,
            focusedBorderColor = Istdi_Green
        )
    )
}

@Composable
fun messageView(){
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally)
    {
        Box (contentAlignment = Alignment.BottomEnd){
            Box(modifier = Modifier
                .fillMaxWidth(0.90f)
                .height(intrinsicSize = IntrinsicSize.Min)
                .padding(5.dp)
                .background(color = FillWhite, shape = RoundedCornerShape(30.dp))
                .border(0.5.dp, color = MainGreen, shape = RoundedCornerShape(30.dp)),
            ){
                Text(text = "fgdgdfgdf" +"vvvvvvvvvvvvvvvvvvvvvvvvvvvvsdvdvsdsdsdvsdvsdsdddddddddddddddddddddddddddd"+
                        "dfdfdfdfsdfdfsdfsdfsdfsdfsdfsdfdfd"+"fgdgdfgdf" +"vvvvvvvvvvvvvvvvvvvvvvvvvvvvsdvdvsdsdsdvsdvsdsdddddddddddddddddddddddddddd"+
                    "dfdfdfdfsdfdfsdfsdfsdfsdfsdfsdfdfd", modifier = Modifier.padding(18.dp),style = Typography.bodyLarge)
            }
            Text("10:26 AM",modifier = Modifier.padding(end = 20.dp, bottom = 10.dp),style = Typography.titleLarge,fontSize = 13.sp)
        }
    }
}

@Composable
fun ContentViewReport(){
    LazyColumn (modifier = Modifier.padding(vertical = 120.dp).background(Color.White)){
        items(5) {
            messageView()
        }
    }
}

@Preview
@Composable
fun PrevReportScreen(){
    ViewReportScreen()
}