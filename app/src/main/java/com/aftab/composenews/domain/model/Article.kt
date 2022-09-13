package com.aftab.composenews.domain.model

import com.aftab.composenews.data.model.SourceDTO

data class Article(
    val content: String,
    val description: String,
    val title: String,
    val urlToImage: String
)
