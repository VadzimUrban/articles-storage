package com.example.articlesstorage.data.entities.manyToMany

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.articlesstorage.data.entities.ArticleLocal
import com.example.articlesstorage.data.entities.ArticleLocalAuthorLocalCrossRef
import com.example.articlesstorage.data.entities.AuthorLocal

data class ArticleWithAuthors(
    @Embedded val articleLocal: ArticleLocal,
    @Relation(
        parentColumn = "article_id",
        entityColumn = "authors_id",
        associateBy = Junction(ArticleLocalAuthorLocalCrossRef::class)
    )
    val authors: List<AuthorLocal>,
)
