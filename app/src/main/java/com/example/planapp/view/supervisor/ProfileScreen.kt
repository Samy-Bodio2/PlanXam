package com.example.planapp.view.supervisor

import android.annotation.SuppressLint
import android.provider.ContactsContract.Profile
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Brush
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.planapp.R
import com.example.planapp.Screen
import com.example.planapp.ui.theme.FillWhite
import com.example.planapp.ui.theme.MainGreen
import com.example.planapp.ui.theme.Typography
import com.example.planapp.view.components.TopAppBAr
import com.example.planapp.view.components.student.BottomAppBar
import com.example.planapp.view.components.supervisor.BottomAppBarT

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ProfileScreen(){
    Scaffold(
        Modifier
            .padding(12.dp)
            .background(Color.White),
        topBar = {
            TopAppBAr()
        },
        content = {
            ProfileBody()
        },
        bottomBar = {
            BottomAppBarT()
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileBody(){
    Column (modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
        .padding(paddingValues = PaddingValues(vertical = 100.dp)),
        verticalArrangement = Arrangement.spacedBy(22.dp,Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Box(
            contentAlignment = Alignment.BottomEnd
        )
        {
            Box(modifier = Modifier
                .height(119.dp)
                .width(119.dp)
                .background(MainGreen, shape = RoundedCornerShape(100.dp)), contentAlignment = Alignment.Center)
            {
                Text(text = "S",color = Color.White, style = TextStyle(
                    fontSize = 80.sp,
                    fontFamily = FontFamily(Font(R.font.inika_bold)),
                    fontWeight = FontWeight(700)
                )
                )
            }
            Box(
                modifier = Modifier
                    .background(color = Color.White, shape = RoundedCornerShape(50.dp))
                    .border(0.5.dp, Color.Black, shape = RoundedCornerShape(50.dp))
                    .width(40.dp)
                    .height(40.dp),
                contentAlignment = Alignment.Center
            )
            {
                Icon(imageVector = Icons.Default.Brush, contentDescription = "",modifier = Modifier
                    .rotate(90f)
                    .size(30.dp))
            }
        }
        Box(
            modifier = Modifier
                .width(350.dp)
                .height(58.dp)
                .background(color = FillWhite, shape = RoundedCornerShape(29.dp))
                .border(0.5.dp, MainGreen, shape = RoundedCornerShape(29.dp)), contentAlignment = Alignment.Center)
        {
            Text(text = "IUC21E97757585",style = Typography.titleLarge, modifier = Modifier.padding(horizontal = 80.dp))
        }
        Box(
            modifier = Modifier
                .width(350.dp)
                .height(58.dp)
                .background(color = FillWhite, shape = RoundedCornerShape(29.dp))
                .border(0.5.dp, MainGreen, shape = RoundedCornerShape(29.dp)), contentAlignment = Alignment.Center)
        {
            Text(text = "Samy Bodio Ongla",style = Typography.titleLarge, modifier = Modifier.padding(horizontal = 80.dp))
        }
        Box(
            modifier = Modifier
                .width(350.dp)
                .height(58.dp)
                .background(color = FillWhite, shape = RoundedCornerShape(29.dp))
                .border(0.5.dp, MainGreen, shape = RoundedCornerShape(29.dp)), contentAlignment = Alignment.Center)
        {
            Text(text = "Password@37Samy",style = Typography.titleLarge, modifier = Modifier.padding(horizontal = 80.dp))
        }
        Box(
            modifier = Modifier
                .width(350.dp)
                .height(58.dp)
                .background(color = FillWhite, shape = RoundedCornerShape(29.dp))
                .border(0.5.dp, MainGreen, shape = RoundedCornerShape(29.dp)), contentAlignment = Alignment.Center)
        {
            Text(text = "samy.bodio21myiuc.com",style = Typography.titleLarge, modifier = Modifier.padding(horizontal = 80.dp))
        }
        Box(
            modifier = Modifier
                .width(350.dp)
                .height(58.dp)
                .background(color = FillWhite, shape = RoundedCornerShape(29.dp))
                .border(0.5.dp, MainGreen, shape = RoundedCornerShape(29.dp)), contentAlignment = Alignment.Center)
        {
            Text(text = "3IAC",style = Typography.titleLarge, modifier = Modifier.padding(horizontal = 80.dp))
        }
        Box(
            modifier = Modifier
                .width(350.dp)
                .height(58.dp)
                .background(color = FillWhite, shape = RoundedCornerShape(29.dp))
                .border(0.5.dp, MainGreen, shape = RoundedCornerShape(29.dp)), contentAlignment = Alignment.CenterStart)
        {
            Text(text = "licence pro Genie Logicielle",style = Typography.titleLarge, modifier = Modifier.padding(horizontal = 80.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PrevProfileScreen(){
    ProfileScreen()
}