package com.eric.newsappteamwork.data.remote.api

import com.eric.newsappteamwork.data.remote.dtos.NewsResponse
import com.eric.newsappteamwork.data.remote.dtos.apple.AppleNewsDto
import retrofit2.http.GET
import retrofit2.http.Query

const val API_KEY = "5f78927d423240d2b6cc0dac6d7b2dea"

interface NewsAppleService {

    @GET("/v2/everything")
    suspend fun fetchAppleNews(
        @Query("q") query: String = "apple",
        @Query("page") page: Int = 1,
        @Query("apiKey") apiKey: String = API_KEY
    ): NewsResponse<AppleNewsDto>
}