package com.example.articlesstorage.data.localDataSource

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.articlesstorage.data.entities.ArticleLocal
import com.example.articlesstorage.data.entities.ArticleLocalAuthorLocalCrossRef
import com.example.articlesstorage.data.entities.AuthorLocal
import com.example.articlesstorage.data.entities.JournalLocal

private const val DB_VERSION = 1

@Database(
    entities = [
        ArticleLocal::class,
        AuthorLocal::class,
        JournalLocal::class,
        ArticleLocalAuthorLocalCrossRef::class,
    ],
    version = DB_VERSION
)
abstract class ArticlesDataBase : RoomDatabase() {
    abstract fun getArticleDao(): ArticleDao
}