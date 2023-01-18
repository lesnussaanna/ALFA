package com.pm.appalfa.admin

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pm.appalfa.admin.pengajuan.CariAlumniActivity
import com.pm.appalfa.admin.pengajuan.PengajuanAlumniActivity
import com.pm.appalfa.databinding.FragmentHomeAdminBinding

class HomeAdmin : Fragment() {

    private var _binding: FragmentHomeAdminBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeAdminBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {

            btnAlumni.setOnClickListener {
                activity.let {
                    val intent = Intent(it, CariAlumniActivity::class.java)
                    startActivity(intent)
                }
            }

            btnEvent.setOnClickListener {
                activity.let {
                    val intent = Intent(it, EventActivity::class.java)
                    startActivity(intent)
                }
            }

            btnPengajuanAlumni.setOnClickListener {
                activity.let {
                    val intent = Intent(it, PengajuanAlumniActivity::class.java)
                    startActivity(intent)
                }
            }

            btnnotif.setOnClickListener {
                activity.let {
                    val intent = Intent(it, NotificationActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}