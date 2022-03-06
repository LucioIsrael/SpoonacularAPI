package br.com.treino.spooncularapi.ui.recipes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.treino.spooncularapi.api.model.RecipeListState
import br.com.treino.spooncularapi.databinding.RecipeFragmentBinding
import br.com.treino.spooncularapi.ui.adapter.RecipeAdapter
import br.com.treino.spooncularapi.ui.base.BaseFragment
import br.com.treino.spooncularapi.ui.state.ResourceStatus
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@AndroidEntryPoint
class RecipesFragment : BaseFragment<RecipeFragmentBinding, RecipesViewModel>() {

    override val viewModel: RecipesViewModel by viewModels()
    private val recipeAdapter by lazy { RecipeAdapter() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        collectObserver()
    }

    private fun collectObserver() {
        viewModel.getRecipes(1)
    }


    private fun setupRecyclerView() = binding.apply {

        recyclerView.apply {
            adapter = recipeAdapter
            layoutManager = LinearLayoutManager(context)
        }

    }

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): RecipeFragmentBinding =
        RecipeFragmentBinding.inflate(inflater, container, false)

}
