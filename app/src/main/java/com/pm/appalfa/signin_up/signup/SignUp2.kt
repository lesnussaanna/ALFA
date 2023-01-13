package com.pm.appalfa.signin_up.signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pm.appalfa.R
import com.pm.appalfa.databinding.FragmentSignUp2Binding
import kotlinx.android.synthetic.main.fragment_sign_up.*

class SignUp2 : Fragment() {
    private var _binding: FragmentSignUp2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSignUp2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            img_back.setOnClickListener {
                findNavController().navigate(SignUp2Directions.actionSignUp2ToSignUp())
            }
            btnselanjutnya.setOnClickListener {
                findNavController().navigate(SignUp2Directions.actionSignUp2ToAmbilKamera())
            }
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}