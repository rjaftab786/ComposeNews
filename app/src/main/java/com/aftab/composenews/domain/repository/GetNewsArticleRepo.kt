package com.aftab.composenews.domain.repository

import com.aftab.composenews.domain.model.Article

interface GetNewsArticleRepo {

    suspend fun getNewsArticle(): List<Article>
}