package com.handearslan.navigationcomponenthomework.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.navArgs
import com.handearslan.navigationcomponenthomework.R
import com.handearslan.navigationcomponenthomework.common.viewBinding
import com.handearslan.navigationcomponenthomework.databinding.FragmentSonuclarBinding
import androidx.navigation.fragment.findNavController

class SonuclarFragment : Fragment(R.layout.fragment_sonuclar) {

    private val binding by viewBinding(FragmentSonuclarBinding::bind)
    private val args by navArgs<com.handearslan.navigationcomponenthomework.ui.SonuclarFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            tvAdSoyad2.text = args.info.personalInfo.adSoyad
            tvEmail.text = args.info.personalInfo.email
            tvPhone.text = args.info.personalInfo.phone
            kacYasindasiniz.text = args.info.soru1
            nerelisiniz.text = args.info.soru2
            mesleginizNedir.text = args.info.soru3
        }

        binding.btnGeriDon.setOnClickListener {

            findNavController().navigate(R.id.resulttogiris);
        }
    }
}



