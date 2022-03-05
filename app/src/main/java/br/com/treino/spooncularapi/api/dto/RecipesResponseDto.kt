package br.com.treino.spooncularapi.api.dto

import br.com.treino.spooncularapi.api.model.RecipesResponse

data class RecipesResponseDto(
    val number: Int,
    val offset: Int,
    val results: List<Result>,
    val totalResults: Int,
)

fun RecipesResponseDto.toRecipesResponse(): RecipesResponse {
    return RecipesResponse(
        results = results,
        number = number
    )
}
