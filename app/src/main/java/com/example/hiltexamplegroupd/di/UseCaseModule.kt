package com.example.hiltexamplegroupd.di

import com.example.domain.repo.mainscreen.MainScreenRepo
import com.example.domain.usecase.mainscreen.GetPosts
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    //Main
    @Provides
    fun provideGetPsostUseCase(mainRepo: MainScreenRepo): GetPosts {
        return GetPosts(mainRepo)
    }









}