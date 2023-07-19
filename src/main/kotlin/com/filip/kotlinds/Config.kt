package com.filip.kotlinds

import com.filip.kotlinds.entity.User
import com.filip.kotlinds.repository.UserRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.*

@Configuration
class Config {

    @Bean
    fun runner(
        userRepository: UserRepository
    ): CommandLineRunner {
        return CommandLineRunner {

            userRepository.findByUsername("username") ?: userRepository.save(
                User(UUID.randomUUID(), "username", "email")
            )
        }
    }

}