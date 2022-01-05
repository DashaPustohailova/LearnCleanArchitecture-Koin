package com.example.cleanarchitecturetest.domain.usecase

import com.example.cleanarchitecturetest.domain.models.SaveUserNameParam
import com.example.cleanarchitecturetest.domain.repository.UserRepository

class SaveUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(param : SaveUserNameParam): Boolean{
        val oldUserName = userRepository.getName()
        if(oldUserName.firstName == param.firstName)
            return true

        return userRepository.saveName(saveParam = param)
    }

}