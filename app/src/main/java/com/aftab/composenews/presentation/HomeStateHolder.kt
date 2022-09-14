package com.aftab.composenews.presentation

import com.aftab.composenews.domain.model.Article

data class HomeStateHolder(

    val isLoading: Boolean = false,
    val data: List<Article>? = null,
    val error: String = ""
)
