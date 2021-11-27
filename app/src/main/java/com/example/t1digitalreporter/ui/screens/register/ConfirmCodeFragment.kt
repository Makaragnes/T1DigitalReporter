package com.example.t1digitalreporter.ui.screens.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.t1digitalreporter.R



/**
 * A simple [Fragment] subclass.
 * Use the [ConfirmCodeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ConfirmCodeFragment : Fragment(R.layout.fragment_register) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)
    }


}