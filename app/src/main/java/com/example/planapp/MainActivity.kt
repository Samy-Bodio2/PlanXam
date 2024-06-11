package com.example.planapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.graphicsLayer
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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.planapp.ui.theme.MainGreen
import com.example.planapp.ui.theme.PlanAppTheme
import com.example.planapp.view.student.LoginScreen
import com.example.planapp.view.student.SignInScreen
import kotlinx.coroutines.delay


class MainActivity : ComponentActivity() {
    lateinit var navController : NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlanAppTheme {
                // A surface container using the 'background' color from the theme
                navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}

@Composable
fun SplashScreen(navController: NavController){
    val rotation = remember { Animatable(0f) }

    LaunchedEffect(Unit) {
        rotation.animateTo(
            targetValue = 1100f,
            animationSpec = tween(durationMillis = 10000, easing = LinearEasing)
        )
        delay(1000)
        navController.popBackStack()
        navController.navigate(Screen.SignIn.route)

    }

            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(33.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Box(modifier = Modifier
                    .graphicsLayer(rotationZ = rotation.value)
                    .height(150.dp)
                    .width(150.dp)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.logo),
                        modifier = Modifier.fillMaxSize(),
                        contentDescription = "PlanXam Logo",
                        contentScale = ContentScale.FillBounds
                    )
                }

                Text(
                    text = "PlanXam",
                    style = TextStyle(
                        fontSize = 30.sp,
                        fontFamily = FontFamily(Font(R.font.inika_bold)),
                        fontWeight = FontWeight(700),
                        color = MainGreen,
                    )
                )
            }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PlanAppTheme {
        SplashScreen(
            navController = rememberNavController()
        )
    }
}