package com.example.cleanarchitecturetest.di

import com.example.cleanarchitecturetest.data.repository.UserRepositoryImpl
import com.example.cleanarchitecturetest.data.storage.UserStorage
import com.example.cleanarchitecturetest.data.storage.sharedPref.SharedPrefUserStorage
import com.example.cleanarchitecturetest.domain.repository.UserRepository
import com.example.cleanarchitecturetest.domain.usecase.GetUserNameUseCase
import com.example.cleanarchitecturetest.domain.usecase.SaveUserNameUseCase
import org.koin.dsl.module






val dataModule = module {
    single<UserStorage> {
        SharedPrefUserStorage(context = get())
    }

    single<UserRepository> {
        UserRepositoryImpl(userStorage = get())
    }
}