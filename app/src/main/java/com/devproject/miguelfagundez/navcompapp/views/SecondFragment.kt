package com.devproject.miguelfagundez.navcompapp.views

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.devproject.miguelfagundez.navcompapp.R
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnSecondFragment.setOnClickListener {
            val sendData = etSendData.text.toString()
            val action = SecondFragmentDirections.actionSecondFragmentToThirdFragment(sendData)
            findNavController().navigate(action)
        }
    }
}