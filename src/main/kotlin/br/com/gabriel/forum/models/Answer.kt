package br.com.gabriel.forum.models

import java.time.LocalDateTime

data class Answer(
    private val id: Long? = null,
    private val message: String,
    private val createdAt: LocalDateTime = LocalDateTime.now(),
    private val author: User,
    private val topic: Topic,
    private val wasResolved: Boolean = false

)
