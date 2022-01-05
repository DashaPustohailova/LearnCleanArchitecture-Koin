package com.example.cleanarchitecturetest.di

import com.example.cleanarchitecturetest.domain.usecase.GetUserNameUseCase
import com.example.cleanarchitecturetest.domain.usecase.SaveUserNameUseCase
import org.koin.dsl.module

val domainModule = module {
    factory<GetUserNameUseCase> {
        GetUserNameUseCase(userRepository = get())
    }

    factory<SaveUserNameUseCase> {
        SaveUserNameUseCase(userRepository = get())
    }
}