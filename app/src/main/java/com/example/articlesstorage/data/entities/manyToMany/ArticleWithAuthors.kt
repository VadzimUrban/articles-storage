package com.example.articlesstorage.data.entities.manyToMany

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.articlesstorage.data.entities.ArticleLocal
import com.example.articlesstorage.data.entities.AuthorLocal

data class ArticleWithAuthors(
    @Embedded val article: ArticleLocal,
    @Relation(
        parentColumn = "articleId",
        entityColumn = "authorId",
        associateBy = Junction(ArticleAuthorCrossRef::class)
    )
    val authors: List<AuthorLocal>
)
