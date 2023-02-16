package com.android.havid.binar_ch5_challenge_suit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.havid.binar_ch5_challenge_suit.databinding.LandingPage1FragmentBinding

class FragmentLandingPage1 : Fragment(){
    private var _binding: LandingPage1FragmentBinding? = null
    private val binding: LandingPage1Fragment
    get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = LandingPage1FragmentBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}