package com.example.lab5ppm.domain

import com.example.lab5ppm.datos.Team

data class Jugadores(
    val id:Int,
    val first_name: String,
    val last_name: String,
    val position: String,
    val height_feet: Int,
    val height_inches: Int,
    val wight_pounds: Int,
    val team: Team
)
