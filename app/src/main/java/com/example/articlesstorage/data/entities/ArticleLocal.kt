package com.example.articlesstorage.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.Year

private const val ARTICLE_TABLE_NAME = "article"

@Entity(tableName = ARTICLE_TABLE_NAME)
data class ArticleLocal(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val id: Long,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "year") val year: Year,
    @ColumnInfo(name = "journal") val journal: JournalLocal,
    @ColumnInfo(name = "authors") val authors: List<AuthorLocal>,
)
