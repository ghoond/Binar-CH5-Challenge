package com.android.havid.binar_ch5_challenge_suit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LandingPageActivity : AppCompatActivity() {
    private val binding: ActivityLandingPageBinding by lazy {
        ActivityLandingPageBinding.inflate(
            layoutInflater
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val landingPage1 = FragmentLandingPage1()
        val landingPage2 = FragmentLandingPage2()
        val landingPage3 = FragmentLandingPage3()

        val landingPageAdapter = LandingPageAdapter(
            fragmentManager = supportFragmentManager,
            landingPage1, landingPage2, landingPage3)

        binding.viewPager.adapter = landingPageAdapter
        binding.viewIndicator.setViewPager(binding.viewPager)
    }
}