package com.eric.newsappteamwork.domain.repositories

import com.eric.newsappteamwork.common.either.Either
import com.eric.newsappteamwork.domain.models.AppleNewsModel
import kotlinx.coroutines.flow.Flow

interface NewsRepository {

    suspend fun fetchAppleNews(): Flow<Either<String,List<AppleNewsModel>>>
}
