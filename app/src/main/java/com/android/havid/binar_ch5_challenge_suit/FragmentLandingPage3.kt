package com.android.havid.binar_ch5_challenge_suit

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentLandingPage3 : Fragment (){

    private var _binding : LandingPage3FragmentBinding? = null
    private val binding : LandingPage3FragmentBinding
    get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = LandingPage3FragmentBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.input_player.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.enter_next.isVisible = s.toString().trim().isNotEmpty()
            }
        })

        binding.enter_next.setOnClockListener{
            if (binding.input_player.text.isNotEmpty()){
                val usermane = binding.input_player.text.toString()
                val intent = Intent(activity, ChooseMode::class.java)
                intent.putExtra("username", usermane)
                startActivity(intent)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}