package com.example.planapp.view.administrator

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DatePicker
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.planapp.R
import com.example.planapp.ui.theme.FillWhite
import com.example.planapp.ui.theme.MainGreen
import com.example.planapp.ui.theme.Typography
import com.example.planapp.view.components.TopAppBAr
import com.example.planapp.view.components.administrator.BottomAppBarA
import com.example.planapp.view.student.InfoSect
import com.maxkeppeker.sheets.core.models.base.rememberSheetState
import com.maxkeppeler.sheets.calendar.CalendarDialog
import com.maxkeppeler.sheets.calendar.models.CalendarSelection

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CreateExam(){
    Scaffold(
        Modifier
            .padding(12.dp)
            .background(Color.White),
        topBar = {
            Column {
                TopAppBAr()
                InfoSect(value = "Create An Exam")
            }
        },
        content = {
            BodyCreateExam()
        },
        bottomBar = {
            BottomAppBarA()
        }
    )
}



@SuppressLint("NewApi")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BodyCreateExam(){
    var name by rememberSaveable {
        mutableStateOf("")
    }
    val calendarState = rememberSheetState()
    val calendarState2 = rememberSheetState()
    var calendar by remember{
        mutableStateOf("")
    }
    var calendar2 by remember{
        mutableStateOf("")
    }
    var calendValue  = if(calendar == ""){
        "Enter your start date"
    }else{
        calendar
    }
    var calendValue2  = if(calendar2 == ""){
        "Enter your end date"
    }else{
        calendar2
    }
    CalendarDialog(state = calendarState, selection = CalendarSelection.Date{
        date -> Log.d("SelectDate","$date")
        calendar = date.toString()
    })
    CalendarDialog(state = calendarState2, selection = CalendarSelection.Date{
            date -> Log.d("SelectDate","$date")
        calendar2 = date.toString()
    })

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top = 170.dp), horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(12.dp))
    {
        OutlinedTextField(value = name, onValueChange = {newText -> name = newText},
            placeholder = {
                Text("Enter your exam name",style = Typography.titleLarge)
            },
            shape = RoundedCornerShape(29.dp),
            modifier = Modifier
                .width(350.dp)
                .height(58.dp)
                .shadow(4.dp, shape = AlertDialogDefaults.shape)
                .background(color = FillWhite), textStyle = Typography.bodyLarge,colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = MainGreen,
                unfocusedBorderColor = MainGreen),
            leadingIcon = {
                Icon(painter = painterResource(id = R.drawable.write_ic), contentDescription = "", tint = MainGreen, modifier = Modifier
                    .size(28.dp)
                    .offset(x = 10.dp))
                Spacer(modifier = Modifier.size(90.dp))
            }
        )

        Button(onClick = { calendarState.show() },colors = ButtonDefaults.buttonColors(
            containerColor = FillWhite),modifier = Modifier
            .width(350.dp)
            .height(58.dp)
            .border(1.dp, color = MainGreen, shape = RoundedCornerShape(30.dp)))
        {
            Row (modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center)
            {
                Icon(painter = painterResource(id = R.drawable.date_range_lightcalendar), contentDescription ="",tint = MainGreen,modifier = Modifier.padding(end = 30.dp))
                Text(text = calendValue, style = Typography.titleLarge,modifier = Modifier.padding(end = 30.dp))
            }
        }

        Button(onClick = { calendarState2.show() },colors = ButtonDefaults.buttonColors(
            containerColor = FillWhite),modifier = Modifier
            .width(350.dp)
            .height(58.dp)
            .border(1.dp, color = MainGreen, shape = RoundedCornerShape(30.dp)))
        {
            Row (modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center)
            {
                Icon(painter = painterResource(id = R.drawable.date_range_lightcalendar), contentDescription ="",tint = MainGreen,modifier = Modifier.padding(end = 30.dp))
                Text(text = calendValue2, style = Typography.titleLarge,modifier = Modifier.padding(end = 30.dp))
            }
        }
        Text(text = "Enter your different sector",style = Typography.bodyLarge,fontSize =19.sp,modifier= Modifier.padding(top = 10.dp))
        LazyVerticalGrid(columns = GridCells.Adaptive(minSize = 70.dp),
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.55f)
                .padding(16.dp))
        {
            items(15){
                var coloR by remember {
                    mutableStateOf(false)
                }
                Box(modifier = Modifier
                    .width(intrinsicSize = IntrinsicSize.Min)
                    .padding(end = 10.dp, bottom = 10.dp)
                    .height(40.dp)
                    .border(0.5.dp, Color.Black, shape = RoundedCornerShape(30.dp))
                    .background(
                        if (coloR) MainGreen else Color.White,
                        shape = RoundedCornerShape(30.dp)
                    )
                    .clickable { coloR = !coloR },
                    contentAlignment = Alignment.Center) {
                    Text(text = "Hkdffff",color = if(coloR) Color.White else Color.Black)
                }
            }
        }

        Button(onClick = { /*TODO*/ },colors = ButtonDefaults.buttonColors(
            containerColor = MainGreen
        ),modifier = Modifier
            .fillMaxWidth(0.90f)
            .height(58.dp)) {
            Text(text = "Create", style = Typography.bodyLarge, fontSize = 25.sp)
        }
    }
}

@Composable
@Preview
fun prevExam(){
    CreateExam()
}