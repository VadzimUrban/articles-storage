package com.example.articlesstorage.domain.repositories

import kotlinx.coroutines.flow.Flow

interface ArticlesRepository {

    fun getAllArticlesFlow(): Flow<List<Article>>

    fun getArticlesByTitleFlow(title: String): Flow<List<Article>>

    suspend fun setArticle(article: Article): Article

    suspend fun updateArticle(article: Article): Article

    suspend fun deleteArticleById(id: Long)

    fun sortArticlesByDataFlow(data: Data): Flow<List<Article>>

    fun sortArticlesByAuthorLastnameFlow(lastname: String): Flow<List<Article>>


}