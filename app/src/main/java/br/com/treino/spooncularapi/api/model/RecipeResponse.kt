package br.com.treino.spooncularapi.api.model

import br.com.treino.spooncularapi.api.dto.ExtendedIngredient
import java.io.Serializable


data class RecipeResponse (

    val id: Int,
    val title: String,
    val image: String,
    val readyInMinutes: Int,
    val spoonacularScore: Double,
    val extendedIngredients: List<ExtendedIngredient>,



): Serializable