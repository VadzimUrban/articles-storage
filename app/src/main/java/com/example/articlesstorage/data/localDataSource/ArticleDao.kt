package com.example.articlesstorage.data.localDataSource

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.articlesstorage.data.entities.ArticleLocal
import com.example.articlesstorage.data.entities.manyToMany.ArticleWithAuthors
import com.example.articlesstorage.domain.entities.Article
import kotlinx.coroutines.flow.Flow

@Dao
interface ArticleDao {

    @Query("SELECT * FROM articles")
    fun getAllArticlesFlow(): Flow<List<ArticleWithAuthors>>

    @Query("SELECT * FROM articles WHERE title LIKE '%' || :title || '%' ")
    fun getArticlesByTitleFlow(title: String): Flow<List<ArticleWithAuthors>>

    @Insert(entity = ArticleLocal::class, onConflict = OnConflictStrategy.IGNORE)
    suspend fun setArticle(article: Article): Article


}