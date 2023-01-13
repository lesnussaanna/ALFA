package com.pm.appalfa.alumni.tracerstudy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pm.appalfa.R
import com.pm.appalfa.databinding.FragmentKuisonerPendidikanBinding
import kotlinx.android.synthetic.main.fragment_tracer_study.*

class KuisonerPendidikan : Fragment() {
    private var _binding: FragmentKuisonerPendidikanBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kuisoner_pendidikan, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            next_tr.setOnClickListener {
                findNavController().navigate(KuisonerPendidikanDirections.actionKuisonerPendidikanToKuisonerSelesai())
            }
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}