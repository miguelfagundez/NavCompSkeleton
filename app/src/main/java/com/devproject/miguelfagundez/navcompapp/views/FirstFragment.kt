package com.devproject.miguelfagundez.navcompapp.views

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.devproject.miguelfagundez.navcompapp.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnFirstFragment.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment()
            findNavController().navigate(action)
        }
    }
}