package com.example.data.repo

import com.example.data.network.mainscreen.JsonPlaceHolderApi
import com.example.domain.entity.PostModelResponseItem
import com.example.domain.repo.mainscreen.MainScreenRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MainScreenRepoImp constructor(private val api:JsonPlaceHolderApi) : MainScreenRepo {
    override suspend fun getPosts(): List<PostModelResponseItem> = withContext(Dispatchers.IO) {
        return@withContext api.getPosts()
    }
}