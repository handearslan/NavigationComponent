package com.handearslan.navigationcomponenthomework.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.handearslan.navigationcomponenthomework.R
import com.handearslan.navigationcomponenthomework.common.viewBinding
import com.handearslan.navigationcomponenthomework.data.PersonalInfo
import com.handearslan.navigationcomponenthomework.databinding.FragmentKisiselBilgilerBinding

class KisiselBilgilerFragment : Fragment(R.layout.fragment_kisisel_bilgiler) {

    private val binding by viewBinding(FragmentKisiselBilgilerBinding::bind)
    private val args by navArgs<com.handearslan.navigationcomponenthomework.ui.KisiselBilgilerFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvAdSoyad2.text = args.adSoyad

        binding.btnDevam.setOnClickListener {

            val adSoyad = args.adSoyad
            val email = binding.etEmail.text.toString()
            val sifre = binding.etSifre.text.toString()
            val phone = binding.etPhone.text.toString()
            val personalInfo = PersonalInfo(adSoyad,email,sifre,phone)

            val action =
                com.handearslan.navigationcomponenthomework.ui.KisiselBilgilerFragmentDirections.kisiselBilgilertoCustom(
                    personalInfo
                )
            findNavController().navigate(action)

        }
    }
}