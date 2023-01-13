package com.pm.appalfa.alumni.tracerstudy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pm.appalfa.R
import com.pm.appalfa.databinding.FragmentSignInBinding
import com.pm.appalfa.databinding.FragmentTracerStudyBinding
import com.pm.appalfa.signin_up.signup.SignUpDirections
import kotlinx.android.synthetic.main.fragment_sign_up.*
import kotlinx.android.synthetic.main.fragment_tracer_study.*

class TracerStudy : Fragment() {
    private var _binding: FragmentTracerStudyBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tracer_study, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            next_tr.setOnClickListener {
                findNavController().navigate(TracerStudyDirections.actionTracerStudyToKuisonerWajib())
            }
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}