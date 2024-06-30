package com.example.planapp.view.student.forums

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
import com.example.planapp.ui.theme.Pisti_Red
import com.example.planapp.ui.theme.MainGreen
import com.example.planapp.ui.theme.Typography
import com.example.planapp.ui.theme.Pisti_Red
import com.example.planapp.ui.theme.Pisti_Green
import com.example.planapp.ui.theme.Icia_Pal
import com.example.planapp.ui.theme.Pisti_Pal
import com.example.planapp.ui.theme.Pisti_Red
import com.example.planapp.ui.theme.logo_back
import com.example.planapp.view.components.student.ForumBottomAppBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ScreenPisti(navController: NavController){
    Scaffold(
        Modifier
            .padding(12.dp)
            .background(Color.White),
        topBar = {
            TopAppBArPisti()
        },
        content = {
            BodyPisti()
        },
        bottomBar = {
            Column {
                messageSectionPisti()
                ForumBottomAppBar(Pisti_Red,navController,2)
            }

        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun messageSectionPisti(){
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
                Icon(imageVector = Icons.Default.Send, contentDescription = "",tint = Pisti_Red)
            }
        },
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = Color.White,
            focusedBorderColor = Pisti_Red
        )
    )
}

@Composable
fun TopAppBArPisti(){
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
                .background(Pisti_Green, shape = RoundedCornerShape(50.dp)), contentAlignment = Alignment.Center)
            {
                Text(text = "S",color = Color.White, style = TextStyle(
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.inika_bold)),
                    fontWeight = FontWeight(700)
                )
                )
            }
            Row{
                Text(text = "P",color = Pisti_Green, style = TextStyle(
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.inika_bold)),
                    fontWeight = FontWeight(700)
                )
                )
                Text(text = "I",color = Pisti_Pal, style = TextStyle(
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.inika_bold)),
                    fontWeight = FontWeight(700)
                )
                )
                Text(text = "S",color = Pisti_Red, style = TextStyle(
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.inika_bold)),
                    fontWeight = FontWeight(700)
                )
                )
                Text(text = "T",color = Pisti_Green, style = TextStyle(
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.inika_bold)),
                    fontWeight = FontWeight(700)
                )
                )
                Text(text = "I Forum",color = Pisti_Pal, style = TextStyle(
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.inika_bold)),
                    fontWeight = FontWeight(700)
                )
                )
            }

        }
        Row(modifier = Modifier.fillMaxWidth(),verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(10.dp,
            Alignment.End)){
            Box(modifier = Modifier
                .width(32.dp)
                .height(32.dp))
            {
                Icon(painter = painterResource(id = R.drawable.logo), contentDescription = "", tint = MainGreen)
            }
            Box(modifier = Modifier
                .width(38.dp)
                .height(38.dp))
            {
                Image(painter = painterResource(id = R.drawable.bell), contentDescription = "",contentScale = ContentScale.FillBounds,modifier = Modifier.background(Color.White))
            }
        }
    }
}

@Composable
fun BodyPisti(){
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center)
    {
        Icon(painter = painterResource(id = R.drawable.logo), contentDescription = "",tint = logo_back, modifier = Modifier
            .width(300.dp)
            .height(300.dp))
    }
    Column (modifier = Modifier
        .verticalScroll(rememberScrollState())
        .padding(paddingValues = PaddingValues(vertical = 150.dp)),
        verticalArrangement = Arrangement.spacedBy(22.dp,Alignment.CenterVertically)){
        LeftMessagePisti()
        RightMessagePisti()
        LeftMessagePisti()
        RightMessagePisti()
        LeftMessagePisti()
    }
}

@Composable
fun LeftMessagePisti(){
    Box(modifier = Modifier
        .fillMaxWidth(),
        contentAlignment = Alignment.TopStart)
    {
        Row(modifier = Modifier.height(intrinsicSize = IntrinsicSize.Min))
        {
            Box (modifier = Modifier
                .fillMaxHeight())
            {
                Row {
                    Box(modifier = Modifier
                        .fillMaxHeight(), contentAlignment = Alignment.BottomStart) {
                        Box(
                            modifier = Modifier
                                .height(33.dp)
                                .width(33.dp)
                                .background(Pisti_Pal, shape = RoundedCornerShape(50.dp)),
                            contentAlignment = Alignment.Center
                        )
                        {
                            Text(
                                text = "T", color = Color.White, style = TextStyle(
                                    fontSize = 20.sp,
                                    fontFamily = FontFamily(Font(R.font.inika_bold)),
                                    fontWeight = FontWeight(700)
                                )
                            )
                        }
                    }
                    Box(modifier = Modifier
                        .fillMaxHeight(), contentAlignment = Alignment.BottomStart) {
                        Icon(painter = painterResource(id = R.drawable.polygon_1), contentDescription = "",modifier = Modifier
                            .height(20.dp)
                            .width(20.dp)
                            ,tint = Pisti_Green)
                    }
                }
            }
            Box(modifier = Modifier.offset(x = (-12).dp)){
                Box(modifier = Modifier
                    .background(Pisti_Green, shape = RoundedCornerShape(20.dp))
                    .fillMaxWidth(0.7f)
                    .padding(start = 15.dp, bottom = 15.dp, end = 15.dp))
                {
                    Column {
                        Text("Tec",color = Pisti_Pal, fontSize = 17.sp,style = Typography.bodyLarge,modifier = Modifier.padding(vertical = 5.dp))
                        Text(
                            text = "High level element that displays text and provides semantics / accessibility information.\n" +
                                    " you may want to consider first retrieving LocalTextStyle, and using TextStyle.copy to keep any theme defined attributes, only modifying the specific attributes you want to override."
                            ,color = Color.White, style = Typography.bodyLarge)
                    }
                }
            }
        }
    }
}

@Composable
fun RightMessagePisti(){
    Box(modifier = Modifier
        .fillMaxWidth(),
        contentAlignment = Alignment.BottomEnd)
    {
        Row(modifier = Modifier.height(intrinsicSize = IntrinsicSize.Min))
        {
            Box(modifier = Modifier.offset(x = (12).dp)){
                Box(modifier = Modifier
                    .background(Pisti_Red, shape = RoundedCornerShape(20.dp))
                    .fillMaxWidth(0.7f)
                    .padding(15.dp))
                {
                    Column {
                        Text(
                            text = "High level element that displays text and provides semantics / accessibility information.\n" +
                                    " keep any theme defined attributes, only modifying the specific attributes you want to override."
                            ,color = Color.White, style = Typography.bodyLarge)
                    }
                }
            }
            Box (modifier = Modifier
                .fillMaxHeight())
            {
                Box(modifier = Modifier
                    .fillMaxHeight(), contentAlignment = Alignment.BottomStart) {
                    Icon(painter = painterResource(id = R.drawable.polygon_1), contentDescription = "",modifier = Modifier
                        .height(20.dp)
                        .width(20.dp)
                        ,tint = Pisti_Red)
                }

            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun prevPisti(){
    ScreenPisti(rememberNavController())
}