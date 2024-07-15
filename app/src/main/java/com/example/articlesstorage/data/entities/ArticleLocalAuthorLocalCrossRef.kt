package com.example.articlesstorage.data.entities

import androidx.room.Entity

@Entity(primaryKeys = ["articleId", "authorId"])
data class ArticleLocalAuthorLocalCrossRef(
    val articleId: Long,
    val authorId: Long,
)
