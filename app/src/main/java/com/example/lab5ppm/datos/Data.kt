package com.example.lab5ppm.datos

import com.example.lab5ppm.domain.Jugadores

data class Data(
    val first_name: String,
    val height_feet: Int,
    val height_inches: Int,
    val id: Int,
    val last_name: String,
    val position: String,
    val team: Team,
    val weight_pounds: Int
)

fun Data.tojugador():Jugadores{
    return Jugadores(
        first_name = first_name,
        height_feet = height_feet,
        height_inches = height_inches,
        id = id,
        last_name = last_name,
        position = position,
        team = team,
        wight_pounds = weight_pounds
    )
}