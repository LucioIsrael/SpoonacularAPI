package br.com.treino.spooncularapi.ui.recipeDetail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import br.com.treino.spooncularapi.databinding.RecipeDetailFragmentBinding
import br.com.treino.spooncularapi.ui.base.BaseFragment

class RecipeDetailFragment : BaseFragment<RecipeDetailFragmentBinding, RecipeDetailViewModel>() {

    override val viewModel: RecipeDetailViewModel by viewModels()
    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): RecipeDetailFragmentBinding =
        RecipeDetailFragmentBinding.inflate(inflater, container, false)
}
