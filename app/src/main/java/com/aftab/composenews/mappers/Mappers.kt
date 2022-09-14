package com.aftab.composenews.mappers

import com.aftab.composenews.data.model.ArticleDTO
import com.aftab.composenews.domain.model.Article

fun List<ArticleDTO>.toDomain(): List<Article> {
    return map {
        Article(
            content = it.content ?: "",
            description = it.description ?: "",
            title = it.title ?: "",
            urlToImage = it.urlToImage ?: ""

        )
    }
}