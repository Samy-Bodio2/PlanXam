package com.example.planapp

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
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
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.postgrest.from
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import kotlinx.datetime.DatePeriod
import kotlinx.serialization.Serializable
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf

val supabase = createSupabaseClient(
    supabaseUrl = "https://qdkspaqdhypmcdjwikuj.supabase.co",
    supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InFka3NwYXFkaHlwbWNkandpa3VqIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MTcyMTE2NDAsImV4cCI6MjAzMjc4NzY0MH0.4SjSQ5TB907ryXfIgBspnBFxZLA_OQgrcsKDSY1sDhc"
) {
    install(Postgrest)
}


class MainActivity : ComponentActivity() {
    lateinit var navController : NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlanAppTheme {
                // A surface container using the 'background' color from the theme
                navController = rememberNavController()
                SetupNavGraph(navController = navController)
//                    ClassroomsList()
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

@Serializable
data class ClassRoom(
    val id: Int,
    val created_at: String,
    val name: String,
    val capacity: Int
)

@Composable
fun ClassroomsList() {
    var classrooms by remember {
        mutableStateOf<List<ClassRoom>>(listOf())
    }
    LaunchedEffect(Unit) {
        withContext(Dispatchers.IO) {
            classrooms = supabase.from("ClassRoom")
                .select().decodeList<ClassRoom>()
        }
    }
    LazyColumn {
        items(classrooms,key = { classRoom -> classRoom.id }){
            Log.d(it.name," The classroom name")
            Log.d(it.created_at," The classroom created_at")
            Log.d(it.capacity.toString()," The classroom capacity")
        }
    }
}