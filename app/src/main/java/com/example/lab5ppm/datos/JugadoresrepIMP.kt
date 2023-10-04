package com.example.lab5ppm.datos

import com.example.lab5ppm.domain.Jugadores
import com.example.lab5ppm.domain.repClases
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class JugadoresrepIMP @Inject constructor(
    private val api: API
):repClases{

    override fun getJugadores(search: String): Flow<Resultado<List<Jugadores>>> = flow{
        emit(Resultado.cargando())
        try{
            val resp = api.getJugadores(search).toListJug()
            emit(Resultado.exito(resp))
        } catch (e: HttpException){
            emit(Resultado.error(
                mensaje = "Algo salio mal, lo sentimos",
                data = null
            ))
        } catch (e: IOException){
            emit(Resultado.error(
                mensaje = "No se puede conectar a internet",
                data = null
            ))
        }
    }

}