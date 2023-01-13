package com.pm.appalfa.signin_up.signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pm.appalfa.R
import com.pm.appalfa.databinding.FragmentSignInBinding
import com.pm.appalfa.databinding.FragmentSignUpBinding
import com.pm.appalfa.signin_up.signin.SignInDirections
import kotlinx.android.synthetic.main.fragment_sign_up.*

class SignUp : Fragment() {
    private var _binding: FragmentSignUpBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSignUpBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            btnselanjutnya.setOnClickListener {
                findNavController().navigate(SignUpDirections.actionSignUpToSignUp2())
            }
            img_back.setOnClickListener {
                findNavController().navigate(SignUpDirections.actionSignUpToSignIn())
            }
            tv_singin.setOnClickListener {
                findNavController().navigate(SignUpDirections.actionSignUpToSignIn())
            }
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
