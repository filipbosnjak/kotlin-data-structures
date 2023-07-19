package com.filip.kotlinds.repository

import com.filip.kotlinds.entity.Post
import com.filip.kotlinds.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface PostRepository: JpaRepository<Post, UUID> {
}