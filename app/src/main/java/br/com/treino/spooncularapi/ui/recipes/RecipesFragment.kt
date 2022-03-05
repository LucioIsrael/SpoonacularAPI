package br.com.treino.spooncularapi.ui.recipes

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import br.com.treino.spooncularapi.databinding.RecipeFragmentBinding
import br.com.treino.spooncularapi.ui.base.BaseFragment

class RecipesFragment : BaseFragment<RecipeFragmentBinding, RecipesViewModel>() {

    override val viewModel: RecipesViewModel by viewModels()
    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): RecipeFragmentBinding =
        RecipeFragmentBinding.inflate(inflater, container, false)

}