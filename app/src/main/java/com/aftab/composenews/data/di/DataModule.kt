package com.aftab.composenews.data.di

import com.aftab.composenews.data.network.ApiService
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@InstallIn(SingletonComponent::class)
@Module
object DataModule {

    fun provideApiService(): ApiService {
        return Retrofit.Builder().baseUrl("https://newsapi.org/v2").addConverterFactory(GsonConverterFactory.create())
            .build().create(ApiService::class.java)
    }
}