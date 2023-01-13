package com.eric.newsappteamwork.domain.repositories

import com.eric.newsappteamwork.domain.models.AppleNewsModel

interface NewsRepository {

    suspend fun fetchAppleNews(): List<AppleNewsModel>
}
