package com.example.articlesstorage.data.localDataSource

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.articlesstorage.data.entities.ArticleLocal
import com.example.articlesstorage.data.entities.AuthorLocal
import com.example.articlesstorage.data.entities.JournalLocal
import com.example.articlesstorage.data.entities.manyToMany.ArticleAuthorCrossRef

@Database(
    entities = [
        ArticleLocal::class,
        AuthorLocal::class,
        JournalLocal::class,
        ArticleAuthorCrossRef::class
    ],
    version = 1
)
abstract class ArticlesDataBase : RoomDatabase() {
    abstract fun getArticleDao(): ArticleDao
}