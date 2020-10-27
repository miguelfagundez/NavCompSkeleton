package com.devproject.miguelfagundez.navcompapp.views

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.devproject.miguelfagundez.navcompapp.R
import kotlinx.android.synthetic.main.fragment_third.*

class ThirdFragment : Fragment(R.layout.fragment_third) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnThirdFragment.setOnClickListener {
            val action = ThirdFragmentDirections.actionThirdFragmentToFirstFragment()
            findNavController().navigate(action)
        }
    }
}