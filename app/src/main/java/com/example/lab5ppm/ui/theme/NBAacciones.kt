package com.example.lab5ppm.ui.theme

import androidx.navigation.NavController

sealed class screen(val ruta: String){
    object main: screen("main")
    object detalle: screen("detalle"){

    }
}

class NBAacciones (navController: NavController){
    val navegacion: () -> Unit ={
        navController.navigate(screen.main.ruta){

        }
    }
}