package br.com.treino.spooncularapi.api.service

import br.com.treino.spooncularapi.api.dto.RecipeResponseDto
import br.com.treino.spooncularapi.api.model.RecipeResponse

import br.com.treino.spooncularapi.util.Constants.APIKEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface RecipeService{

@GET("&recipes/{id}/information$$APIKEY")
suspend fun getRecipes(@Path(value = "id", encoded = true)id : Long): RecipeResponseDto
}