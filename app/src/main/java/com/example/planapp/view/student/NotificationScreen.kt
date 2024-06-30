package com.example.planapp.view.student

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DeleteOutline
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.planapp.R
import com.example.planapp.ui.theme.FillWhite
import com.example.planapp.ui.theme.MainGreen
import com.example.planapp.ui.theme.Typography
import com.example.planapp.view.components.student.BottomAppBar
import com.example.planapp.view.components.student.TopAppBarStudent

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun NotificationScreen(navController: NavController){
    Scaffold(
        Modifier
            .padding(12.dp)
            .background(Color.White),
        topBar = {
            Column {
                TopAppBarStudent(navController = navController)
                InfoSect(null)
            }
        },
        content = {
            BodyNotification()
        },
        bottomBar = {
            BottomAppBar(navController,1)
        }
    )
}

@Composable
fun TopAppBarN(){
    Row(modifier = Modifier
        .height(90.dp)
        .background(Color.White)
        .padding(12.dp),verticalAlignment = Alignment.CenterVertically){
        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(10.dp,
            Alignment.Start))
        {
            Box(modifier = Modifier
                .height(40.dp)
                .width(40.dp)
                .background(MainGreen, shape = RoundedCornerShape(50.dp)), contentAlignment = Alignment.Center)
            {
                Text(text = "S",color = Color.White, style = TextStyle(
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.inika_bold)),
                    fontWeight = FontWeight(700)
                )
                )
            }
            Text(text = "Samy Bodio",color = MainGreen, style = TextStyle(
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.inika_bold)),
                fontWeight = FontWeight(700)
            )
            )
        }
        Row(modifier = Modifier.fillMaxWidth(),verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(10.dp,
            Alignment.End)){
            Box(modifier = Modifier
                .width(32.dp)
                .height(32.dp))
            {
                Icon(painter = painterResource(id = R.drawable.hamburger), contentDescription = "", tint = MainGreen)
            }
            Box(modifier = Modifier
                .width(38.dp)
                .height(38.dp))
            {
                Image(painter = painterResource(id = R.drawable.bell), contentDescription = "",contentScale = ContentScale.FillBounds,modifier = Modifier.background(
                    Color.White))
            }
        }
    }
}

@Composable
fun InfoSect(value: String?){


    Box(modifier = Modifier
        .fillMaxWidth()
        .height(60.dp)
        .background(color = FillWhite),
        contentAlignment = Alignment.Center)
    {
        Text(text = value ?: "You have 9 notifications active",style = Typography.bodyLarge,color = MainGreen, fontSize = 18.sp)
    }
}

@Composable
fun BodyNotification(){
    var mExpanded by rememberSaveable { mutableStateOf(false) }
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
                    Text(text = "Classroom Attribution",style = Typography.labelSmall,color = MainGreen,fontSize = 15.sp,
                        modifier = Modifier.padding(start = 9.dp,top = 13.dp,end = 7.dp,bottom=8.dp))
                    Row {
                        Box(modifier = Modifier
                            .padding(start = 9.dp, top = 7.dp, end = 11.dp)
                            .background(Color.Red, shape = RoundedCornerShape(20.dp))
                            .size(10.dp))
                        Text(text = "3IAC . 4:30 PM",style = Typography.labelSmall, fontSize = 13.sp,fontWeight = FontWeight.Normal)
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
fun prevNotification(){
    NotificationScreen(rememberNavController())
}