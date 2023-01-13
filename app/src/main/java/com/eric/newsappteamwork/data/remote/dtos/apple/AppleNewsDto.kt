package com.eric.newsappteamwork.data.remote.dtos.apple

import com.eric.newsappteamwork.domain.models.AppleNewsModel
import com.google.gson.annotations.SerializedName

data class AppleNewsDto(

    @SerializedName("author")
    val author: String?,
    @SerializedName("title")
    val title: String,
    @SerializedName("content")
    val content: String,
    @SerializedName("urlToImage")
    val urlToImage: String
)

fun AppleNewsDto.toDomain() = AppleNewsModel(
    author = author,
    title = title,
    content = content,
    urlToImage = urlToImage
)