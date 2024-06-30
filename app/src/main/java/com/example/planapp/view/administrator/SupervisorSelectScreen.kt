package com.example.planapp.view.administrator

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
fun SupervisorSelectScreen(){
    Scaffold(modifier = Modifier
        .padding(paddingValues = PaddingValues(12.dp))
        .background(Color.White),
        topBar = {
            Column{
                TopAppBAr()
                InfoSect("Select They Supervisor")
            }
        },
        content = {
            ContentSelect()
        },
        bottomBar = {
            BottomAppBarA()
        }
    )
}

@Composable
fun ContentSelect(){
Column{
        LazyColumn (modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.80f)
            .padding(top = 170.dp), horizontalAlignment = Alignment.CenterHorizontally)
        {
            items(10){
                var coloR by rememberSaveable {
                    mutableStateOf(false)
                }
                Box(
                    modifier = Modifier
                        .width(350.dp)
                        .height(60.dp)
                        .padding(bottom = 12.dp)
                        .background(Color.White, shape = RoundedCornerShape(29.dp))
                        .border(0.5.dp, MainGreen, shape = RoundedCornerShape(29.dp)), contentAlignment = Alignment.Center)
                {
                    Row (verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween){
                        Text(text = "Mouofo Danela",style = Typography.bodyLarge, modifier = Modifier.padding(horizontal = 80.dp))
                        Box(
                            modifier = Modifier
                                .border(
                                    0.5.dp,
                                    color = MainGreen,
                                    shape = RoundedCornerShape(50.dp)
                                )
                                .background(
                                    if (coloR) MainGreen else Color.White,
                                    shape = RoundedCornerShape(50.dp)
                                )
                                .height(30.dp)
                                .width(30.dp)
                                .clickable {
                                    coloR = !coloR
                                }
                        )
                    }
                }
            }
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
            Button(onClick = { /*TODO*/ },colors = ButtonDefaults.buttonColors(
                containerColor = MainGreen
            ),modifier = Modifier
                .padding(top = 12.dp)
                .fillMaxWidth(0.90f)
                .height(58.dp))
            {
                Text(text = "Next", style = Typography.bodyLarge, fontSize = 25.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PrevSupervisor(){
    SupervisorSelectScreen()
}