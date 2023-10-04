package com.example.lab5ppm.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun NBANavGraph(modifier:Modifier = Modifier, navegacion: ()-> Unit, navController: NavHostController= rememberNavController(),startDestination: String = screen.main.ruta){
        NavHost(navController = navController, startDestination = startDestination, builder = modifier){

        }
}