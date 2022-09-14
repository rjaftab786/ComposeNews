package com.aftab.composenews.domain.use_case

import com.aftab.composenews.domain.model.Article
import com.aftab.composenews.domain.repository.GetNewsArticleRepo
import com.aftab.composenews.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetNewsArticleUseCase @Inject constructor(private val getNewsArticleRepo: GetNewsArticleRepo) {

    operator fun invoke(): Flow<Resource<List<Article>>> = flow {

        try {
            emit(Resource.Loading(""))
            emit(Resource.Success(getNewsArticleRepo.getNewsArticle()))
        } catch (e: Exception) {
            emit(Resource.Error(e.message))
        }
    }
}