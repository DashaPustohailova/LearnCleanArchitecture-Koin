package com.example.cleanarchitecturetest.data.storage

import com.example.cleanarchitecturetest.data.storage.models.User

interface UserStorage {

    fun save(user: User): Boolean

    fun get(): User
}