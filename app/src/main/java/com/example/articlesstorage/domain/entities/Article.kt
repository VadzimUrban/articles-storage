package com.example.articlesstorage.domain.entities

import java.time.Year

data class Article(
    val id: Long,
    val title: String,
    val year: Int,
    val journal: Journal,
    val authors: List<Author>,
)
