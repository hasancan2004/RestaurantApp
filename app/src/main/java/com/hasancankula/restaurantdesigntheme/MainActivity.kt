package com.hasancankula.restaurantdesigntheme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hasancankula.restaurantdesigntheme.screens.ForgotPasswordScreen
import com.hasancankula.restaurantdesigntheme.screens.HomeScreen
import com.hasancankula.restaurantdesigntheme.screens.LoginScreen
import com.hasancankula.restaurantdesigntheme.screens.ResetPasswordScreen
import com.hasancankula.restaurantdesigntheme.screens.SignUpConfirmScreen
import com.hasancankula.restaurantdesigntheme.screens.SignUpScreen
import com.hasancankula.restaurantdesigntheme.screens.StartScreen
import com.hasancankula.restaurantdesigntheme.ui.theme.RestaurantDesignThemeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RestaurantDesignThemeTheme {
                val navController = rememberNavController()
                MyAppNavHost(navController = navController)
            }
        }
    }
}

@Composable
fun MyAppNavHost(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = "startScreen"

    ){
        composable("startScreen"){
            StartScreen(navController)
        }
        composable("signUpScreen"){
            SignUpScreen(navController)
        }
        composable("signUpConfirmScreen"){
            SignUpConfirmScreen(navController)
        }
        composable("resetPasswordScreen"){
            ResetPasswordScreen(navController)
        }
        composable("loginScreen"){
            LoginScreen(navController)
        }
        composable("homeScreen"){
            HomeScreen(navController)
        }
        composable("forgotPasswordScreen"){
            ForgotPasswordScreen(navController)
        }
    }
}

