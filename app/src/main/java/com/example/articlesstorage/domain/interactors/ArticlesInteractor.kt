package com.example.articlesstorage.domain.interactors

import com.example.articlesstorage.domain.entities.Article
import com.example.articlesstorage.domain.repositories.ArticlesRepository
import kotlinx.coroutines.flow.Flow
import java.time.Year

class ArticlesInteractor(private val articlesRepository: ArticlesRepository) {

    fun getAllArticlesFlow(): Flow<List<Article>> = articlesRepository.getAllArticlesFlow()

    fun getArticlesByTitleFlow(title: String): Flow<List<Article>> = articlesRepository.getArticlesByTitleFlow(title)

    suspend fun setArticle(article: Article): Article = articlesRepository.setArticle(article)

    suspend fun updateArticle(article: Article): Article = articlesRepository.updateArticle(article)

    suspend fun deleteArticleById(id: Long) = articlesRepository.deleteArticleById(id)

    fun sortArticlesByYearFlow(year: Year): Flow<List<Article>> = articlesRepository.sortArticlesByYearFlow(year)

    fun sortArticlesByAuthorLastnameFlow(lastname: String): Flow<List<Article>> = articlesRepository.sortArticlesByAuthorLastnameFlow(lastname)
}