package br.com.treino.spooncularapi.ui.saves

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import br.com.treino.spooncularapi.databinding.SaveRecipeFragmentBinding
import br.com.treino.spooncularapi.ui.base.BaseFragment

class SaveRecipeFragment: BaseFragment<SaveRecipeFragmentBinding, SaveRecipeViewModel>() {

    override val viewModel: SaveRecipeViewModel by viewModels()

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): SaveRecipeFragmentBinding =
        SaveRecipeFragmentBinding.inflate(inflater, container, false)

}