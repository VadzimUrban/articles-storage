package com.example.articlesstorage.data.entities.oneToMany

import androidx.room.Embedded
import androidx.room.Relation
import com.example.articlesstorage.data.entities.ArticleLocal
import com.example.articlesstorage.data.entities.JournalLocal
import com.example.articlesstorage.data.entities.manyToMany.ArticleWithAuthors

data class JournalWithArticlesAndAuthors(
    @Embedded val journalLocal: JournalLocal,
    @Relation(
        entity = ArticleLocal::class,
        parentColumn = "id",
        entityColumn = "journalId"
    )
    val article: ArticleWithAuthors
)
