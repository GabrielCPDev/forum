package br.com.gabriel.forum.models

import java.time.LocalDateTime

data class Topic(
    private val id: Long? = null,
    private val title: String,
    private val message: String,
    private val createdrAt: LocalDateTime = LocalDateTime.now(),
    private val course: Course,
    private val author: User,
    private val status: StatusTopic = StatusTopic.NOT_ANSWER,
    private val answers: List<Answer> = ArrayList()
)
