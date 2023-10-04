package com.example.lab5ppm.ui.theme

import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination

sealed class screen(val ruta: String){
    object main: screen("main")
    object detalle: screen("detalle"){

    }
}

class NBAacciones (navController: NavController){
    val navegacion: () -> Unit ={
        navController.navigate(screen.main.ruta){
            popUpTo(navController.graph.findStartDestination().id){
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }

}