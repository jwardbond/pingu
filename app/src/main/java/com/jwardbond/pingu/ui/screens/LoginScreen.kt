package com.jwardbond.pingu.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text

import androidx.compose.runtime.*

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen(onLoginClick: () -> Unit) {
    var email by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        ) {
        OutlinedTextField(
            value = email,
            onValueChange = { email = it }, // damn "it" is some crazy sugar
            label = { Text("Email") },
        )
        Spacer(modifier = Modifier.height(8.dp))

        Button(onClick = onLoginClick) {
            Text("Sign In with Email Link")
        }
    }
}