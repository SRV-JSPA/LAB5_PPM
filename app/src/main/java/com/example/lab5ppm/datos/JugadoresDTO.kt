package com.example.lab5ppm.datos

import com.example.lab5ppm.domain.Jugadores

data class JugadoresDTO(
    val `data`: List<Data>,
    val meta: Meta
)

fun JugadoresDTO.toListJug(): List<Jugadores>{
    val res = data.mapIndexed { _, entradas ->
        Jugadores(
            id = entradas.id,
            first_name = entradas.first_name,
            last_name = entradas.last_name,
            position = entradas.position,
            height_feet = entradas.height_feet,
            height_inches = entradas.height_inches,
            wight_pounds = entradas.weight_pounds,
            team = entradas.team
        )
    }
    return res
}