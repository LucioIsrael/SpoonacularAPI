package br.com.treino.spooncularapi.api.RecipeRepository


import br.com.treino.spooncularapi.api.dto.RecipeResponseDto
import br.com.treino.spooncularapi.api.service.RecipeService
import javax.inject.Inject

class RecipeRepository @Inject constructor(
    private val api: RecipeService
){

    suspend fun getRecipes(id : Long): RecipeResponseDto {
        return api.getRecipes(id = id)
    }

}