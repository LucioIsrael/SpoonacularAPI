package br.com.treino.spooncularapi.ui.createRecipe

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import br.com.treino.spooncularapi.databinding.CreateRecipeFragmentBinding
import br.com.treino.spooncularapi.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CreateRecipeFragment :
    BaseFragment<CreateRecipeFragmentBinding, CreateRecipeViewModel>() {

    override val viewModel: CreateRecipeViewModel by viewModels()
    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): CreateRecipeFragmentBinding =
        CreateRecipeFragmentBinding.inflate(inflater, container, false)

}