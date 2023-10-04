package com.example.lab5ppm.datos

import retrofit2.http.GET
import retrofit2.http.Query

interface API {
    @GET("players/")
    suspend fun getJugadores(
        @Query("search") search: String
    ): JugadoresDTO


}