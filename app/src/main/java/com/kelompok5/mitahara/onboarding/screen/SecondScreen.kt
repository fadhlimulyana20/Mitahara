package com.kelompok5.mitahara.onboarding.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kelompok5.mitahara.R

/**
 * A simple [Fragment] subclass.
 * Use the [SecondScreen.newInstance] factory method to
 * create an instance of this fragment.
 */
class SecondScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second_screen, container, false)
    }
}