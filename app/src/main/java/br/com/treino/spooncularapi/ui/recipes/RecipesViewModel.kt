package br.com.treino.spooncularapi.ui.recipes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.treino.spooncularapi.api.RecipeRepository.RecipeRepository
import br.com.treino.spooncularapi.api.dto.toRecipeResponse
import br.com.treino.spooncularapi.api.model.RecipeListState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

@HiltViewModel
class RecipesViewModel @Inject constructor(
    private val repository: RecipeRepository,
) : ViewModel() {

    private var _recipes =
        MutableLiveData<RecipeListState>()
    val recipes: LiveData<RecipeListState> = _recipes


    fun getRecipes(id: Long) {
        viewModelScope.launch(Dispatchers.Main) {
            try {
                _recipes.value = RecipeListState(isLoading = true)
                val recipeResponseDto = repository.getRecipes(id = id)
                val recipeResponse = recipeResponseDto.toRecipeResponse()
                _recipes.value = RecipeListState(recipeList = recipeResponse)

            } catch (e: HttpException) {
                _recipes.value = RecipeListState(error = e.message() ?: "An unexpected error occurred")
            } catch (e: IOException) {
                _recipes.value = RecipeListState(error = "Couldn't receive any data")
            }
        }
    }
}