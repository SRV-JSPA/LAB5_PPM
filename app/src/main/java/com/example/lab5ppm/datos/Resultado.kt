package com.example.lab5ppm.datos

sealed class Resultado<T>(val data:T? = null, val mensaje: String? = null){
    class cargando<T>(data:T? = null): Resultado<T>(data)
    class exito<T>(data:T?): Resultado<T>(data)
    class error<T>(mensaje: String, data: T? = null): Resultado<T>(data, mensaje)
}