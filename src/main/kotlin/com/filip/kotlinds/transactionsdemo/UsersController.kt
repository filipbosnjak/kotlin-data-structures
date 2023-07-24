package com.filip.kotlinds.transactionsdemo

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UsersController(
    private val userService: UserService
) {

    @GetMapping
    fun saveUsers(): ResponseEntity<String> {
        userService.saveUsers()
        return ResponseEntity.status(HttpStatus.OK).body("Users saved successfully")
    }
}