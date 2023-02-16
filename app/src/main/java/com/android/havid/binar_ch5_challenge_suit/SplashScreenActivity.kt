package com.android.havid.binar_ch5_challenge_suit

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.android.havid.binar_ch5_challenge_suit.databinding.ActivitySplashScreenBinding
import com.android.havid.binar_ch5_challenge_suit.loadImage

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity(){

    private val binding: ActivitySplashScreenBinding by lazy {
        ActivitySplashScreenBinding.inflate(
            layoutInflater
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()

        val url = "https://i.ibb.co/HC5ZPgD/splash-screen1.png"
        binding.text_logo.loadImage(url)

        val loadingSplash = 2000L
        handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, LandingPageActivity::class.java)
            startActivity(intent)
            finish()
        }, delaySplash)
    } companion object
}