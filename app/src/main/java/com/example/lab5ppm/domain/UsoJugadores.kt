package com.example.lab5ppm.domain

import com.example.lab5ppm.datos.Resultado
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class UsoJugadores @Inject constructor(
    private val repo: repClases
){
    operator fun invoke(search:String):Flow<Resultado<List<Jugadores>>>{
        return repo.getJugadores(search)
    }
}