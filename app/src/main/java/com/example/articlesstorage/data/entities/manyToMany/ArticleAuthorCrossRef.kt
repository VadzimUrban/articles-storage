package com.example.articlesstorage.data.entities.manyToMany

import androidx.room.Entity

@Entity(primaryKeys = ["articleId", "authorId"])
data class ArticleAuthorCrossRef(
    val articleId: Long,
    val authorId: Long,
)
