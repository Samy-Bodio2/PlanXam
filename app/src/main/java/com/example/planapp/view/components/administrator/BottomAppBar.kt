package com.example.planapp.view.components.administrator

import android.annotation.SuppressLint
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.EditNote
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PersonAdd
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.StickyNote2
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.planapp.ui.theme.MainGreen
import com.exyte.animatednavbar.AnimatedNavigationBar
import com.exyte.animatednavbar.animation.balltrajectory.Parabolic
import com.exyte.animatednavbar.animation.balltrajectory.Straight
import com.exyte.animatednavbar.animation.indendshape.shapeCornerRadius
import com.exyte.animatednavbar.utils.noRippleClickable



@Composable
fun BottomAppBarA(){
    val navigationBarItems = remember { NavigationBarItems.values() }
    var selectedIndex by remember { mutableStateOf(0) }
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
                    .noRippleClickable { selectedIndex = item.ordinal },
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
    Exam(icon = Icons.Default.School),
    Person(icon = Icons.Default.PersonAdd),
    Forum(icon = Icons.Default.EditNote),
    Note(icon = Icons.Default.StickyNote2)

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
    BottomAppBarA()
}