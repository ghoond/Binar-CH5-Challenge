package com.android.havid.binar_ch5_challenge_suit

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class LandingPageAdapter (
    fragmentManager: FragmentManager,
    private vararg val fragment: Fragment
        ) : FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){

            override fun getCount(): Int{
                return fragment.size
            }

            override fun getItem(position: Int): Fragment {
            return fragment[position]
            }
        }