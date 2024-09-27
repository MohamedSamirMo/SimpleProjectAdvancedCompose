package com.example.domain.usecase.mainscreen

import com.example.domain.repo.mainscreen.MainScreenRepo

class GetPosts (private val mainScreenRepo: MainScreenRepo) {
    operator suspend fun invoke() = mainScreenRepo.getPosts()
}