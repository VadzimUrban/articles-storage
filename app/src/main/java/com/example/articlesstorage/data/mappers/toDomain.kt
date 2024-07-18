package com.example.articlesstorage.data.mappers

import com.example.articlesstorage.data.entities.ArticleLocal
import com.example.articlesstorage.data.entities.AuthorLocal
import com.example.articlesstorage.data.entities.JournalLocal
import com.example.articlesstorage.data.entities.manyToMany.ArticleWithAuthors
import com.example.articlesstorage.data.entities.oneToMany.JournalWithArticlesAndAuthors
import com.example.articlesstorage.domain.entities.Article
import com.example.articlesstorage.domain.entities.Author
import com.example.articlesstorage.domain.entities.Journal
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map


fun Flow<List<JournalWithArticlesAndAuthors>>.toArticle(): Flow<List<Article>> =
    map { listJournalWithArticlesAndAuthors ->
        listJournalWithArticlesAndAuthors.map { journalWithArticlesAndAuthors ->
            with(journalWithArticlesAndAuthors) {
                Article(
                    id = article.articleLocal.id,
                    title = article.articleLocal.title,
                    year = article.articleLocal.year,
                    journal = journalLocal.toJournal(),
                    authors = article.authors.toAuthors()
                )
            }
        }
    }


fun JournalLocal.toJournal(): Journal = Journal(
    id,
    title,
    country,
    city,
    year,
    firstPage,
    lastPage,
    otherInformation
)

fun Journal.toJournalLocal(): JournalLocal = JournalLocal(
    id,
    title,
    country,
    city,
    year,
    firstPage,
    lastPage,
    otherInformation
)


fun Article.toArticleLocal(): ArticleLocal = ArticleLocal(
    id,
    title,
    year,
    journal.id
)

fun Article.toJoutnalWithArticlesAndAuthors(): JournalWithArticlesAndAuthors =
    JournalWithArticlesAndAuthors(
        journal.toJournalLocal(),
        ArticleWithAuthors(
            ArticleLocal(
                id,
                title,
                year,
                journal.id
            ),
            authors.toAuthorsLocal()
        )

    )

fun List<AuthorLocal>.toAuthors(): List<Author> = map { authorLocal ->
    with(authorLocal) {
        Author(
            id,
            firstname,
            lastname,
            surname
        )
    }
}

fun List<Author>.toAuthorsLocal(): List<AuthorLocal> = map { author ->
    with(author) {
        AuthorLocal(
            id, firstname, lastname, surname
        )
    }
}