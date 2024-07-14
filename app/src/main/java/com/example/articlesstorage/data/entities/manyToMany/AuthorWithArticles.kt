package com.example.articlesstorage.data.entities.manyToMany

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.articlesstorage.data.entities.ArticleLocal
import com.example.articlesstorage.data.entities.AuthorLocal

data class AuthorWithArticles(
    @Embedded
    val author: AuthorLocal,
    @Relation(
        parentColumn = "authorId",
        entityColumn = "articleId",
        associateBy = Junction(ArticleAuthorCrossRef::class)
    )
    val articles: List<ArticleLocal>
)

