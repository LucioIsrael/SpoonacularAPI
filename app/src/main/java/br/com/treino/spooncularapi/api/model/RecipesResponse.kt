package br.com.treino.spooncularapi.api.model

import br.com.treino.spooncularapi.api.dto.Result

data class RecipesResponse (
    val results: List<Result>,
    val number: Int
)
