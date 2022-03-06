package br.com.treino.spooncularapi.api.model

data class RecipeListState(

    val isLoading: Boolean = false,
    val recipeList: RecipeResponse = RecipeResponse(
        id = 0,
        title = "",
        image = "",
        readyInMinutes = 0,
        spoonacularScore = 0.0,
        extendedIngredients = emptyList()),
    val error: String = ""
)
