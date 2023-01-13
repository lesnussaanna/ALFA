package com.pm.appalfa.alumni

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.pm.appalfa.R
import com.pm.appalfa.databinding.ActivityMainAlumniBinding

class MainActivityAlumni : AppCompatActivity() {

    private lateinit var binding: ActivityMainAlumniBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainAlumniBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeAlumni())

        binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){

                R.id.home -> replaceFragment(HomeAlumni())
                R.id.search -> replaceFragment(SearchAlumni())
                R.id.event -> replaceFragment(EventAlumni())
                R.id.notification -> replaceFragment(NotificationAlumni())
                R.id.account -> replaceFragment(AccountAlumni())

                else ->{

                }
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment){

        val fragementManager = supportFragmentManager
        val fragmentTransaction = fragementManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }
}