package com.pm.appalfa.signin_up.signup

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityCompat
import androidx.navigation.fragment.findNavController
import com.pm.appalfa.R
import com.pm.appalfa.databinding.FragmentAmbilGambarBinding
import com.pm.appalfa.databinding.FragmentSignUp2Binding
import com.pm.appalfa.databinding.FragmentSignUpBinding
import kotlinx.android.synthetic.main.activity_ambil_kamera.*
import kotlinx.android.synthetic.main.fragment_sign_up.*

class AmbilGambar : Fragment() {
    private var _binding: FragmentAmbilGambarBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAmbilGambarBinding.inflate(inflater, container, false)
        return binding.root
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        binding.apply {
//            btnselanjutnya.setOnClickListener {
//                findNavController().navigate(AmbilGambarDirections.actionAmbilGambarToBerhasilKirim())
//            }
//        }
//    }
//    override fun onDestroy() {
//        super.onDestroy()
//        _binding = null
    }
