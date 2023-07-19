package com.filip.kotlinds.entity

import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "user")
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID,

    @Column
    val username: String,

    @Column
    val email: String

)