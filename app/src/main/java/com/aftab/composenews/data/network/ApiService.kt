package com.aftab.composenews.data.network

import com.aftab.composenews.data.model.NewsDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    // https://newsapi.org/v2/top-headlines?sources=techcrunch&apiKey=b591e09ff2df4bf5947090ab6b59d41c


    @GET("top-headlines")
    suspend fun getNewsArticles(
        @Query("Country") country: String = "us",
        @Query("apiKey") apiKey: String = "b591e09ff2df4bf5947090ab6b59d41c"
    ):Response<NewsDTO>

}