package com.pm.appalfa.signin_up.signin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
//import android.widget.Toast
//import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
//import com.google.android.material.textfield.TextInputEditText
//import com.google.android.material.textfield.TextInputLayout
//import com.pm.appalfa.R
import com.pm.appalfa.databinding.FragmentSignInBinding
import kotlinx.android.synthetic.main.fragment_sign_in.*

class SignIn : Fragment() {
    private var _binding: FragmentSignInBinding? = null
    private val binding get() = _binding!!
//    private val viewModel: SignInViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSignInBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       super.onViewCreated(view, savedInstanceState)
//
//        val preferences = Preferences(requireContext())
//        preferences.setValues("onboarding", "1")
//
        binding.apply {
//            focusChange(tilEmail, etEmail)
//            focusChange(tilPassword, etPassword)
//
            btnsignin.setOnClickListener {
                findNavController().navigate(SignInDirections.actionSignInToMainActivityAlumni())
            }
            logo_alfa.setOnClickListener {
                findNavController().navigate(SignInDirections.actionSignInToMainActivityAdmin())
            }
//                if (isErrorOrEmpty(tilEmail, etEmail) || isErrorOrEmpty(tilPassword, etPassword)) {
//                    Toast.makeText(
//                        requireContext(),
//                        "Please fill the field with the right data",
//                        Toast.LENGTH_SHORT
//                    ).show()
//                } else {
//                    showLoading(true, requireContext())
//                    viewModel.loginUser(
//                        UserInfo(
//                            email = etEmail.text.toString(),
//                            password = etPassword.text.toString(),
//                        )
//                    ).observe(viewLifecycleOwner) {
//                        if (it != null) {
//                            preferences.apply {
//                                setValues("uuid", it.uuid)
//                                setValues("name", it.name)
//                                setValues("token", it.accessToken)
//                                setValues("password", etPassword.text.toString())
//                                setValues("no_hp", it.no_hp)
//                                setValues("confpassword", etPassword.text.toString())
//                                setValues("email", it.email)
//                            }
//                            showLoading(false, requireContext())
//                            findNavController().navigate(SignInFragmentDirections.actionSignInFragmentToMainActivity())
//                        } else {
//                            showLoading(false, requireContext())
//                            Toast.makeText(requireContext(), "Login Failed", Toast.LENGTH_SHORT)
//                                .show()
//                        }
//                    }
//                }
//            }
//
            forgotPassword.setOnClickListener{
                findNavController().navigate(SignInDirections.actionSignInToForgotPassword())
            }

            tvRegister.setOnClickListener {
                findNavController().navigate(SignInDirections.actionSignInToSignUp())
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

//    private fun focusChange(textInputLayout: TextInputLayout, editText: TextInputEditText) {
//        editText.setOnFocusChangeListener { _, hasFocus ->
//            binding.apply {
//                when {
//                    /** Remove error State when focused **/
//                    hasFocus -> removeError(textInputLayout, editText, requireContext())
//                    /** Checking empty state status on all Edit text **/
//                    editText.text.toString().isEmpty() -> setError(
//                        textInputLayout,
//                        editText,
//                        "Field cannot be empty",
//                        requireContext()
//                    )
//                    editText == etPassword && editText.text.toString().length < 8 -> setError(
//                        textInputLayout,
//                        editText,
//                        "Password must be at least 8 characters",
//                        requireContext()
//                    )
//                    editText == etEmail && !isEmailValid(editText.text.toString()) -> setError(
//                        textInputLayout,
//                        editText,
//                        "Please enter a valid email address",
//                        requireContext()
//                    )
//                }
//            }
//        }
//    }
}