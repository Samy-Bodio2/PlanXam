package com.example.planapp.view.components.student

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.EditNote
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.planapp.Navigable
import com.example.planapp.R
import com.example.planapp.Screen
import com.example.planapp.ui.theme.FillWhite
import com.example.planapp.ui.theme.MainGreen
import com.example.planapp.ui.theme.l3iac_Red
import com.example.planapp.view.student.LoginScreen
import com.exyte.animatednavbar.AnimatedNavigationBar
import com.exyte.animatednavbar.animation.balltrajectory.Parabolic
import com.exyte.animatednavbar.animation.balltrajectory.Straight
import com.exyte.animatednavbar.animation.indendshape.shapeCornerRadius
import com.exyte.animatednavbar.utils.noRippleClickable
import com.google.accompanist.systemuicontroller.rememberSystemUiController


@SuppressLint("CommitPrefEdits")
@Composable
fun BottomAppBar(navController: NavController,index: Int){

    val systemUiController = rememberSystemUiController()
    var color by remember { mutableStateOf(Color.White) }

    val navigationBarItems = remember { NavigationBarItems.values() }
    var selectedIndex by rememberSaveable { mutableStateOf(index) }
    AnimatedNavigationBar(
        modifier = Modifier
            .height(64.dp)
            .background(Color.White),
        selectedIndex = selectedIndex,
        cornerRadius = shapeCornerRadius(cornerRadius = 34.dp),
        ballAnimation =  Parabolic(tween(300)),
        barColor = MainGreen,
        ballColor = MainGreen
    )
    {
        navigationBarItems.forEach {
                item ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .noRippleClickable {
                        selectedIndex = item.ordinal;
                        color = if(item.ordinal == 2){
                            l3iac_Red
                        }else{
                            MainGreen
                        }
                        systemUiController.setStatusBarColor(color)


                        navController.navigate(item.Navigable)
                    },
                contentAlignment = Alignment.Center
            ){
                Icon(
                    modifier = Modifier.size(26.dp),
                    imageVector = item.icon,
                    contentDescription = "Bottom Bar Icon",
                    tint = if(selectedIndex == item.ordinal) Color.White
                    else Color.Black
                )
            }
        }
    }
}

@Composable
fun ForumBottomAppBar(color: Color,navController: NavController,index: Int){

    val systemUiController = rememberSystemUiController()
    var color2 by remember { mutableStateOf(Color.White) }

    val navigationBarItems = remember { NavigationBarItems.values() }
    var selectedIndex by remember { mutableStateOf(index) }
    AnimatedNavigationBar(
        modifier = Modifier
            .height(64.dp)
            .background(Color.White),
        selectedIndex = selectedIndex,
        cornerRadius = shapeCornerRadius(bottomLeft = 34.dp, bottomRight = 34.dp, topLeft = 0.dp, topRight = 0.dp),
        ballAnimation =  Straight(tween(300)),
        barColor = color,
        ballColor = color
    )
    {
        navigationBarItems.forEach {
                item ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .noRippleClickable { selectedIndex = item.ordinal;
                        color2 = if(item.ordinal != 2){
                            MainGreen
                        }else{
                            l3iac_Red
                        }
                        systemUiController.setStatusBarColor(color2)
                        navController.navigate(item.Navigable) },
                contentAlignment = Alignment.Center
            ){
                Icon(
                    modifier = Modifier.size(26.dp),
                    imageVector = item.icon,
                    contentDescription = "Bottom Bar Icon",
                    tint = if(selectedIndex == item.ordinal) Color.White
                    else Color.Black
                )
            }
        }
    }
}

enum class NavigationBarItems(val icon: ImageVector,val Navigable: String)
{
    Home(icon = Icons.Default.Home, Screen.Home.route),
    Notification(icon = Icons.Default.Notifications, Screen.Notification.route),
    Forum(icon = Icons.Default.EditNote,Screen.Forum.route),
    Person(icon = Icons.Default.Person,Screen.Profile.route)
}


@SuppressLint("ModifierFactoryUnreferencedReceiver")
fun Modifier.noRippleClickable(onClick: () -> Unit) : Modifier = composed(){
    clickable(
        indication = null,
        interactionSource = remember { MutableInteractionSource() }){
        onClick()
    }
}
@Preview(showBackground = true)
@Composable
fun PrevBottomAppBar(){
    BottomAppBar(rememberNavController(),0)
}