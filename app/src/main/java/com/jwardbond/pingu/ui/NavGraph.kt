// NavGraph.kt
package com.jwardbond.pingu.ui

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.jwardbond.pingu.ui.screens.HomeScreen
import com.jwardbond.pingu.ui.screens.LoginScreen

// This is an extension function on NavGraphBuilder
// It adds the login composable to the navigation graph.
fun NavGraphBuilder.addLoginRoute(navController: NavController) {
    composable("login") {
        LoginScreen(
            onLoginClick = {
                navController.navigate("home") {
                    popUpTo("login") { inclusive = true }
                }
            }
        )
    }
}

// And this one adds the home composable.
fun NavGraphBuilder.addHomeRoute(navController: NavController) {
    composable("home") {
        HomeScreen(
            onLogoutClick = {
                navController.navigate("login") {
                    popUpTo("home") { inclusive = true }
                }
            }
        )
    }
}