package com.example.gitstudy.appUi

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Home(modifier: Modifier = Modifier) {

    println("This is first commit")
    println("This is second commit")
    println("This is third 2 commit")
    println("This is 4rd commit")

    println("This is my Experimental branch code")
    println("Hi My friend My name is Vishal and i added a simple changes")



}

@Composable
fun Button2(modifier: Modifier = Modifier) {
    androidx.compose.material3.Button(onClick = {}) {
        Text("Okay")
    }
}