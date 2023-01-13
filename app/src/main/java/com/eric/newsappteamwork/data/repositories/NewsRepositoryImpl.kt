package com.eric.newsappteamwork.data.repositories

import com.eric.newsappteamwork.data.remote.api.NewsAppleService
import com.eric.newsappteamwork.data.remote.dtos.apple.toDomain
import com.eric.newsappteamwork.domain.models.AppleNewsModel
import com.eric.newsappteamwork.domain.repositories.NewsRepository
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(
    private val appleService: NewsAppleService
) : NewsRepository {

    override suspend fun fetchAppleNews(): List<AppleNewsModel> {
        return appleService.fetchAppleNews().articles.map { appleNewsDto ->
            appleNewsDto.toDomain()
        }
    }
}