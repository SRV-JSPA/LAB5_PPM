package com.example.lab5ppm.ui.theme

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.rememberNavController

@SuppressLint("RememberReturnType")
@Composable
fun NBAApp(){
    Lab5PPMTheme {
        val navegation = rememberNavController()
        val navacciones = remember(navegation){
            NBAacciones(navegation)
        }
    }
}


