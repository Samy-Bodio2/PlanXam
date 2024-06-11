package com.example.planapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.planapp.view.student.LoginScreen
import com.example.planapp.view.student.SignInScreen

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
    }
}