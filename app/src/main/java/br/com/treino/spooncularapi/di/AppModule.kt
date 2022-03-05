package br.com.treino.spooncularapi.di

import br.com.treino.spooncularapi.api.dto.RecipeQueryApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRetrofit(): RecipeQueryApi {

    }

}