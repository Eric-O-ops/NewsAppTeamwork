package com.eric.newsappteamwork.data.repositories

import com.eric.newsappteamwork.common.base.BaseRepository
import com.eric.newsappteamwork.common.either.Either
import com.eric.newsappteamwork.data.remote.api.NewsAppleService
import com.eric.newsappteamwork.data.remote.dtos.apple.toDomain
import com.eric.newsappteamwork.domain.models.AppleNewsModel
import com.eric.newsappteamwork.domain.repositories.NewsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(
    private val appleService: NewsAppleService
) : BaseRepository() ,NewsRepository {

    override suspend fun fetchAppleNews() = doRequest {
        appleService.fetchAppleNews().articles.map { appleNewsDto ->
            appleNewsDto.toDomain()
        }
    }
}