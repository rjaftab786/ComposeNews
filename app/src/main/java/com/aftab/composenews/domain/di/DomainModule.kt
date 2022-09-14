package com.aftab.composenews.domain.di

import com.aftab.composenews.data.network.ApiService
import com.aftab.composenews.data.repository.GetNewsArticleRepoImpl
import com.aftab.composenews.domain.repository.GetNewsArticleRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn

@InstallIn
@Module
object DomainModule {

    @Provides
    fun provideGetNewsRepo(apiService: ApiService): GetNewsArticleRepo {
        return GetNewsArticleRepoImpl(apiService = apiService)
    }
}