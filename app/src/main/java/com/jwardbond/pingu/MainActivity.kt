package com.jwardbond.pingu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

import com.jwardbond.pingu.ui.addLoginRoute
import com.jwardbond.pingu.ui.addHomeRoute
import com.jwardbond.pingu.ui.theme.PinguTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PinguTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination="login") {
                    addLoginRoute(navController)
                    addHomeRoute(navController)
                }
            }
        }
    }
}

//
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    PinguTheme {
//        Greeting("Android")
//    }
//}