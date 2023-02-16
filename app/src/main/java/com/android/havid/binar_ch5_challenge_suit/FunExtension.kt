package com.android.havid.binar_ch5_challenge_suit

import androidx.appcompat.widget.AppCompatImageView
import com.bumptech.glide.Glide


fun AppCompatImageView.loadImage(url: String){
    Glide.with(context)
        .load(url)
        .into(this)
}