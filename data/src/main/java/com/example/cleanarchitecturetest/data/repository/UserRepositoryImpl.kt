package com.example.cleanarchitecturetest.data.repository

import com.example.cleanarchitecturetest.data.storage.models.User
import com.example.cleanarchitecturetest.data.storage.UserStorage
import com.example.cleanarchitecturetest.domain.models.SaveUserNameParam
import com.example.cleanarchitecturetest.domain.models.UserName
import com.example.cleanarchitecturetest.domain.repository.UserRepository


class UserRepositoryImpl(private val userStorage: UserStorage): UserRepository {

    override fun saveName(saveParam: SaveUserNameParam): Boolean{
        return userStorage.save(mapToStorage(saveParam))
    }

    override fun getName(): UserName{
        return  mapToDomain(userStorage.get())
    }

    private fun mapToStorage(saveParam: SaveUserNameParam): User{
        return User(firstName = saveParam.firstName, lastName = saveParam.lastName)
    }

    private fun mapToDomain(user: User): UserName{
        return UserName(firstName = user.firstName, lastName = user.lastName)
    }

}