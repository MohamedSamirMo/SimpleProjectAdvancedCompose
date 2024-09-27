package com.example.domain.repo.mainscreen

import com.example.domain.entity.PostModelResponseItem

interface MainScreenRepo {

    suspend fun getPosts(): List<PostModelResponseItem>
}