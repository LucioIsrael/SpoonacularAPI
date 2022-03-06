package br.com.treino.spooncularapi.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import br.com.treino.spooncularapi.api.model.RecipeResponse
import br.com.treino.spooncularapi.databinding.ItemRecipeBinding
import br.com.treino.spooncularapi.util.loadImage

class RecipeAdapter : RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>() {

    inner class RecipeViewHolder(val binding: ItemRecipeBinding) :
        RecyclerView.ViewHolder(binding.root)

    private val differCallBack = object : DiffUtil.ItemCallback<RecipeResponse>() {
        override fun areItemsTheSame(oldItem: RecipeResponse, newItem: RecipeResponse): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }

        override fun areContentsTheSame(oldItem: RecipeResponse, newItem: RecipeResponse): Boolean {
            return oldItem.id == newItem.id && oldItem.title == newItem.title &&
                    oldItem.spoonacularScore == newItem.spoonacularScore && oldItem.image == newItem.image
                    && oldItem.readyInMinutes == newItem.readyInMinutes

        }
    }

    private val differ = AsyncListDiffer(this, differCallBack)

    var recipes : List<RecipeResponse>
    get() = differ.currentList
        set(value) = differ.submitList(value)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        return RecipeViewHolder(
            ItemRecipeBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val recipe = recipes[position]
        holder.binding.apply {
            tvTitle.text = recipe.title
            tvMinutes.text = "${recipe.readyInMinutes.toString()} min"
            rbScore.rating = recipe.spoonacularScore.toFloat()
            loadImage(ivImage, recipe.image)
        }


    }

    override fun getItemCount() = recipes.size

}