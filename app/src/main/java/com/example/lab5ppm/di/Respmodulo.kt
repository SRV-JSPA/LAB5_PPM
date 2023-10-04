package com.example.lab5ppm.di

import com.example.lab5ppm.datos.JugadoresrepIMP
import com.example.lab5ppm.domain.repClases
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class Respmodulo {

    @Binds
    abstract fun JugbindRepo(impl: JugadoresrepIMP): repClases
}