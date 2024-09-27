package com.example.hiltexamplegroupd.di

import android.content.Context
import com.example.data.network.mainscreen.JsonPlaceHolderApi
import com.example.data.repo.MainScreenRepoImp
import com.example.domain.repo.mainscreen.MainScreenRepo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {
    @Provides
    fun provideMainScreenRepo(
       api:JsonPlaceHolderApi
    ): MainScreenRepo {
        return MainScreenRepoImp(api)
    }


}