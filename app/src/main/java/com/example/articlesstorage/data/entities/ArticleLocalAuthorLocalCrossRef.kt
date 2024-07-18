package com.example.articlesstorage.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(primaryKeys = ["articleId", "authorId"])
data class ArticleLocalAuthorLocalCrossRef(
    @ColumnInfo(name = "article_id") val articleId: Long,
    @ColumnInfo(name = "author_id") val authorId: Long,
)
