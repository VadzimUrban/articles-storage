package com.example.articlesstorage.data.localDataSource

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.example.articlesstorage.data.entities.ArticleLocal
import com.example.articlesstorage.data.entities.oneToMany.JournalWithArticlesAndAuthors
import kotlinx.coroutines.flow.Flow

@Dao
interface ArticleDao {

    @Transaction
    @Query("SELECT * FROM articles")
    fun getAllJournalsWithArticlesAndAuthorsFlow(): Flow<List<JournalWithArticlesAndAuthors>>

    @Transaction
    @Query("SELECT * FROM articles WHERE title LIKE '%' || :title || '%' ")
    fun getArticlesByTitleFlow(title: String): Flow<List<JournalWithArticlesAndAuthors>>

    @Transaction
    @Insert(entity = ArticleLocal::class, onConflict = OnConflictStrategy.IGNORE)
    suspend fun setArticle(article: JournalWithArticlesAndAuthors)

}