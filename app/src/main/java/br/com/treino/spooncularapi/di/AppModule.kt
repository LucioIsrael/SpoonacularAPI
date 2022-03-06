package br.com.treino.spooncularapi.di

import br.com.treino.spooncularapi.api.RecipeRepository.RecipeRepository
import br.com.treino.spooncularapi.api.service.RecipeService
import br.com.treino.spooncularapi.util.Constants
import br.com.treino.spooncularapi.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Singleton
    @Provides
    fun provideRetrofit(): RecipeService {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(RecipeService::class.java)
    }

    @Singleton
    @Provides
    fun provideRecipeRepository(api: RecipeService): RecipeRepository{
        return RecipeRepository(api = api)
    }

}