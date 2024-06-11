package com.example.planapp


sealed class Screen(
    val route: String,
    ) {
    object Splashcreen : Screen(route = "Splashscreen")
    object Login : Screen(route = "Login_Screen")
    object SignIn : Screen(route = "SignIn_Screen")
    object Home : Screen(route = "Home_Screen")
    object Notification : Screen(route = "Notification_Screen")
    object Profile : Screen(route = "Profile_Screen")
}