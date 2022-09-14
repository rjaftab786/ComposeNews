package com.aftab.composenews.data.repository

import com.aftab.composenews.data.network.ApiService
import com.aftab.composenews.domain.model.Article
import com.aftab.composenews.domain.repository.GetNewsArticleRepo
import com.aftab.composenews.mappers.toDomain
import com.aftab.composenews.utils.SafeApiRequest
import javax.inject.Inject

class GetNewsArticleRepoImpl @Inject constructor(private val apiService: ApiService) :
    GetNewsArticleRepo, SafeApiRequest() {
    override suspend fun getNewsArticle(): List<Article> {

        val response = safeApiRequest { apiService.getNewsArticles() }
        return response?.articles?.toDomain()!!
    }
}