package com.filip.kotlinds.transactionsdemo

import com.filip.kotlinds.entity.User
import com.filip.kotlinds.repository.UserRepository
import com.filip.kotlinds.transactionsdemo.exception.CustomException
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService(
    private val userRepository: UserRepository
) {
    @Transactional
    fun saveUsers() {
        userRepository.save(User(UUID.randomUUID(),"user1", "email1"))
        userRepository.save(User(UUID.randomUUID(),"user2", "email2"))
        throw CustomException("Saving user exception")
    }
}