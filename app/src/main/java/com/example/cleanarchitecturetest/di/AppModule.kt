package com.example.cleanarchitecturetest.di

import com.example.cleanarchitecturetest.presentation.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel<MainViewModel>{
        MainViewModel(get(),get())
    }
}