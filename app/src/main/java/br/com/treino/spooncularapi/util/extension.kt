package br.com.treino.spooncularapi.util

import android.widget.ImageView
import com.bumptech.glide.Glide

fun loadImage(
    imageView: ImageView,
    ivImage : String
){
    Glide.with(imageView.context)
        .load(ivImage)
        .into(imageView)
}