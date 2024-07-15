package com.example.articlesstorage.data.repositories

import com.example.articlesstorage.data.localDataSource.ArticleDao
import com.example.articlesstorage.data.mappers.toArticle
import com.example.articlesstorage.data.mappers.toArticleLocal
import com.example.articlesstorage.data.mappers.toJoutnalWithArticlesAndAuthors
import com.example.articlesstorage.domain.entities.Article
import com.example.articlesstorage.domain.repositories.ArticlesRepository
import kotlinx.coroutines.flow.Flow
import java.time.Year

class ArticlesRepositoryImpl(private val articlesDao: ArticleDao) : ArticlesRepository {

    override fun getAllArticlesFlow(): Flow<List<Article>> =
        articlesDao.getAllJournalsWithArticlesAndAuthorsFlow().toArticle()

    override fun getArticlesByTitleFlow(title: String): Flow<List<Article>> =
        articlesDao.getArticlesByTitleFlow(title).toArticle()

    override suspend fun setArticle(article: Article) =
        articlesDao.setArticle(article.toJoutnalWithArticlesAndAuthors())

    override suspend fun updateArticle(article: Article): Article {
        TODO("Not yet implemented")
    }

    override suspend fun deleteArticleById(id: Long) {
        TODO("Not yet implemented")
    }

    override fun sortArticlesByYearFlow(year: Year): Flow<List<Article>> {
        TODO("Not yet implemented")
    }

    override fun sortArticlesByAuthorLastnameFlow(lastname: String): Flow<List<Article>> {
        TODO("Not yet implemented")
    }


}