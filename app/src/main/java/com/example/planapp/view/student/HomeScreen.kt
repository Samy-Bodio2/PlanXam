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
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.planapp.R
import com.example.planapp.model.staticData.SchoolRepo
import com.example.planapp.ui.theme.FillWhite
import com.example.planapp.ui.theme.MainGreen
import com.example.planapp.ui.theme.Typography
import com.example.planapp.view.components.TopAppBAr
import com.example.planapp.view.components.student.BottomAppBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(){
    Scaffold (Modifier.padding(12.dp).background(Color.White),
        topBar = {
            TopAppBAr()
        },
        content = {
            Body()
        },
        bottomBar = {
            BottomAppBar()
        }
    )
}

@Composable
fun CustomItem(school: SchoolRepo.School){
    Box(modifier = Modifier.padding(top = 20.dp, bottom = 20.dp)){
        Row(
            modifier = Modifier
                .height(100.dp)
                .fillMaxWidth(0.90f)
                .background(color = FillWhite, shape = RoundedCornerShape(20.dp))
                .border(0.5.dp, color = MainGreen, shape = RoundedCornerShape(20.dp)),
        ){
            Box(modifier = Modifier
                .padding(end = 12.dp)
                .width(60.dp)
                .fillMaxHeight(), contentAlignment = Alignment.CenterStart){
                Image(school.Image,contentDescription = null,)
            }
            Column (modifier = Modifier.padding(vertical = 10.dp)){
                Text(school.Name+"-Forum",style = Typography.bodyLarge, fontSize = 15.sp,color = MainGreen, modifier = Modifier.padding(horizontal = 10.dp,vertical=5.dp))
                Text(school.Description,style = Typography.bodyLarge, fontSize = 12.sp, fontWeight = FontWeight.Light)
            }
        }
    }
}

@Composable
fun Body(){
    val schoolRepo = SchoolRepo()
    val data = schoolRepo.getAllData()
    LazyColumn(modifier = Modifier.fillMaxSize().background(Color.White), horizontalAlignment = Alignment.CenterHorizontally, contentPadding = PaddingValues(vertical = 100.dp))
    {
        items(items = data){school ->
            CustomItem(school = school)
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PrevCustomItem(){
//    val school = SchoolRepo.School(painterResource(id = R.drawable.icia),"ICIA","Institut de Commerce et d’Ingénierie d’Affaire")
//    CustomItem(school = school)
    HomeScreen()
}
