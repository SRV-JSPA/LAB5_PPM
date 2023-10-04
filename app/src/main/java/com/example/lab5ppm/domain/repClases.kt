package com.example.lab5ppm.domain

import com.example.lab5ppm.datos.Resultado
import kotlinx.coroutines.flow.Flow

interface repClases {
    fun getJugadores(search: String):Flow<Resultado<List<Jugadores>>>
}