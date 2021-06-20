package com.kelompok5.mitahara.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kelompok5.mitahara.R
import com.kelompok5.mitahara.databinding.FragmentViewPagerBinding
import com.kelompok5.mitahara.onboarding.screen.FirstScreen
import com.kelompok5.mitahara.onboarding.screen.SecondScreen
import com.kelompok5.mitahara.onboarding.screen.ThirdScreen

class ViewPagerFragment : Fragment() {
    private var _binding: FragmentViewPagerBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentViewPagerBinding.inflate(inflater, container, false)
        val view = binding.root
//        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        val fragmentList = arrayListOf<Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen(),
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding.viewPager.adapter = adapter

        return view
    }

}