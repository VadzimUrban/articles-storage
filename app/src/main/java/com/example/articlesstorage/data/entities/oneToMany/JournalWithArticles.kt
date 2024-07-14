package com.example.articlesstorage.data.entities.oneToMany

import androidx.room.Embedded
import androidx.room.Relation
import com.example.articlesstorage.data.entities.ArticleLocal
import com.example.articlesstorage.data.entities.JournalLocal

data class JournalWithArticles(
    @Embedded val journal: JournalLocal,
    @Relation(
        parentColumn = "id",
        entityColumn = "journal_id"
    )
    val articles: List<ArticleLocal>
)
