package com.example.articlesstorage.domain.repositories

import com.example.articlesstorage.domain.entities.Article
import kotlinx.coroutines.flow.Flow
import java.time.Year

interface ArticlesRepository {

    fun getAllArticlesFlow(): Flow<List<Article>>

    fun getArticlesByTitleFlow(title: String): Flow<List<Article>>

    suspend fun setArticle(article: Article): Article

    suspend fun updateArticle(article: Article): Article

    suspend fun deleteArticleById(id: Long)

    fun sortArticlesByDataFlow(year: Year): Flow<List<Article>>

    fun sortArticlesByAuthorLastnameFlow(lastname: String): Flow<List<Article>>


}