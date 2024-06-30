package com.example.planapp.view.administrator

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.planapp.R
import com.example.planapp.ui.theme.New_Bleu
import com.example.planapp.ui.theme.New_Green
import com.example.planapp.ui.theme.New_Red
import com.example.planapp.ui.theme.Typography
import com.example.planapp.ui.theme.White
import com.example.planapp.ui.theme.logo_back
import com.example.planapp.view.components.TopAppBAr
import com.example.planapp.view.components.administrator.BottomAppBarA

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeAdmin(){
    Scaffold(modifier = Modifier.padding(paddingValues = PaddingValues(12.dp)),
        topBar = {
            TopAppBAr()
        },
        content = {
            contentAdminHome()
        },
        bottomBar = {
            BottomAppBarA()
        }
    )
}

@Composable
fun contentAdminHome(){
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center)
    {
        Icon(painter = painterResource(id = R.drawable.logo), contentDescription = "",tint = logo_back, modifier = Modifier
            .width(300.dp)
            .height(300.dp))
    }
    HomeAdminCard()
}

@Composable
fun HomeAdminCard(){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top = 100.dp), verticalArrangement = Arrangement.spacedBy(20.dp)){
        Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.spacedBy(15.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically) {
            Box(modifier = Modifier
                .background(color = New_Red, shape = RoundedCornerShape(20.dp))
                .zIndex(1f).fillMaxWidth(0.48f)
                .height(170.dp))
            {
                Column(modifier = Modifier.padding(10.dp)){
                    Icon(painter = painterResource(id = R.drawable.book), contentDescription = "",tint = Color.Unspecified)
                    Text(text = "Create Exam",style = Typography.bodyLarge,color = White, fontSize = 18.sp
                        ,modifier = Modifier.padding(start =10.dp))
                    Text(text = "3IAC department\nFor IUC",style = Typography.bodyLarge,color = White,fontSize = 12.sp,modifier = Modifier.padding(start =10.dp,top=20.dp))
                }
            }
            Box(modifier = Modifier
                .background(color = New_Green, shape = RoundedCornerShape(20.dp))
                .zIndex(1f).fillMaxWidth()
                .height(170.dp))
            {
                Column(modifier = Modifier.padding(10.dp)){
                    Icon(painter = painterResource(id = R.drawable.user_add), contentDescription = "",tint = Color.Unspecified)
                    Text(text = "Create Teacher",style = Typography.bodyLarge,color = White, fontSize = 18.sp
                        ,modifier = Modifier.padding(start =10.dp))
                    Text(text = "3IAC department\nFor IUC",style = Typography.bodyLarge,color = White,fontSize = 12.sp,modifier = Modifier.padding(start =10.dp,top=20.dp))
                }
            }
        }
        Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.spacedBy(15.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically) {
            Box(modifier = Modifier
                .background(color = New_Bleu, shape = RoundedCornerShape(20.dp))
                .zIndex(1f)
                .width(180.dp)
                .height(170.dp))
            {
                Column(modifier = Modifier.padding(10.dp)){
                    Icon(painter = painterResource(id = R.drawable.chat_alt_2_light), contentDescription = "",tint = Color.Unspecified)
                    Text(text = "Comment",style = Typography.bodyLarge,color = White, fontSize = 18.sp
                        ,modifier = Modifier.padding(start =10.dp))
                    Text(text = "3IAC department\nFor IUC",style = Typography.bodyLarge,color = White,fontSize = 12.sp,modifier = Modifier.padding(start =10.dp,top=20.dp))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun prevHome(){
    HomeAdmin()
}