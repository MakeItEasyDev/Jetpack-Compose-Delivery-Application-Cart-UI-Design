package com.jetpack.restaurantapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jetpack.restaurantapp.ui.theme.RestaurantAppTheme

@ExperimentalMaterialApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            RestaurantAppTheme {
                Surface(color = MaterialTheme.colors.background) {
                    NavHost(
                        navController = navController,
                        startDestination = "home_screen"
                    ) {
                        composable("home_screen") {
                            RestaurantHomeScreen(navController)
                        }
                        composable("recipe_screen") {
                            RecipesScreen()
                        }
                    }
                }
            }
        }
    }
}