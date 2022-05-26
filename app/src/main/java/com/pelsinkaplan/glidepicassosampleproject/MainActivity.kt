package com.pelsinkaplan.glidepicassosampleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val glideImageView = findViewById<ImageView>(R.id.glide_imageView)
        val picassoImageView = findViewById<ImageView>(R.id.picasso_imageView)

        val eeveeImage = "https://assets.pokemon.com/assets/cms2/img/pokedex/full/133.png"
        val pikachuImage = "https://assets.pokemon.com/assets/cms2/img/pokedex/full/025.png"

        Glide.with(this).load(eeveeImage).into(glideImageView)

        Picasso.get().load(pikachuImage).into(picassoImageView)
    }
}