package com.example.planapp.view.components.student

import android.annotation.SuppressLint
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
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.planapp.R
import com.example.planapp.ui.theme.FillWhite
import com.example.planapp.ui.theme.MainGreen
import com.example.planapp.view.student.LoginScreen
import com.exyte.animatednavbar.AnimatedNavigationBar
import com.exyte.animatednavbar.animation.balltrajectory.Parabolic
import com.exyte.animatednavbar.animation.balltrajectory.Straight
import com.exyte.animatednavbar.animation.indendshape.shapeCornerRadius
import com.exyte.animatednavbar.utils.noRippleClickable

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun BottomAppBarP(){
    val navigationBarItems = remember { NavigationBarItems.values() }
    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(modifier = Modifier.padding(12.dp),
        bottomBar ={
            AnimatedNavigationBar(
                modifier = Modifier.height(64.dp),
                selectedIndex = selectedIndex,
                cornerRadius = shapeCornerRadius(cornerRadius = 34.dp),
                ballAnimation = Parabolic(tween(300)),
                barColor = MainGreen,
                ballColor = MainGreen
            )
            {
                navigationBarItems.forEach {
                    item ->
                    Box(
                       modifier = Modifier.fillMaxSize().noRippleClickable { selectedIndex = item.ordinal },
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
        } ){

    }
}

@Composable
fun BottomAppBar(){
    val navigationBarItems = remember { NavigationBarItems.values() }
    var selectedIndex by remember { mutableStateOf(0) }
    AnimatedNavigationBar(
        modifier = Modifier.height(64.dp).background(Color.White),
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
                modifier = Modifier.fillMaxSize().noRippleClickable { selectedIndex = item.ordinal },
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
fun ForumBottomAppBar(color: Color){
    val navigationBarItems = remember { NavigationBarItems.values() }
    var selectedIndex by remember { mutableStateOf(0) }
    AnimatedNavigationBar(
        modifier = Modifier.height(64.dp).background(Color.White),
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
                modifier = Modifier.fillMaxSize().noRippleClickable { selectedIndex = item.ordinal },
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

enum class NavigationBarItems(val icon: ImageVector)
{
    Home(icon = Icons.Default.Home),
    Notification(icon = Icons.Default.Notifications),
    Forum(icon = Icons.Default.EditNote),
    Person(icon = Icons.Default.Person)
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
    BottomAppBar()
}