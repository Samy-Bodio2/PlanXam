package com.example.planapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.planapp.view.student.HomeScreen
import com.example.planapp.view.student.LoginScreen
import com.example.planapp.view.student.NotificationScreen
import com.example.planapp.view.student.ProfileScreen
import com.example.planapp.view.student.SignInScreen
import com.example.planapp.view.supervisor.forums.Screen3iac

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = Screen.Splashcreen.route)
    {
        composable(route = Screen.Splashcreen.route){ SplashScreen(navController) }
        composable(route = Screen.Login.route){ LoginScreen(navController) }
        composable(route = Screen.SignIn.route){ SignInScreen(navController) }
        composable(route = Screen.Home.route){ HomeScreen(navController)}
        composable(route = Screen.Profile.route){ ProfileScreen(navController) }
        composable(route = Screen.Notification.route){ NotificationScreen(navController) }
        composable(route = Screen.Forum.route){ Screen3iac(navController) }
    }
}