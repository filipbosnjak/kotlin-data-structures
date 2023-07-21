package com.filip.kotlinds.scopesimpl

import com.filip.kotlinds.entity.User
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class UserController {

    @GetMapping("/users")
    @RequiresScope(Scope.READ)
    fun users(): ResponseEntity<List<User>> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(listOf(
                User(UUID.randomUUID(),"user1", "email1"),
                User(UUID.randomUUID(),"user2", "email2")
            ))
    }
}