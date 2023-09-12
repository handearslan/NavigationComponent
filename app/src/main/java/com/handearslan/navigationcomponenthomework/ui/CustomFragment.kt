package com.handearslan.navigationcomponenthomework.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.handearslan.navigationcomponenthomework.R
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.handearslan.navigationcomponenthomework.common.viewBinding
import com.handearslan.navigationcomponenthomework.data.Info
import com.handearslan.navigationcomponenthomework.databinding.FragmentCustomBinding

class CustomFragment : Fragment(R.layout.fragment_custom) {
    private val binding by viewBinding(FragmentCustomBinding::bind)
    private val args by navArgs<com.handearslan.navigationcomponenthomework.ui.CustomFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvAdSoyad.text = args.personelInfo.adSoyad
        val personalInfo = args.personelInfo

        binding.btnSonuclar.setOnClickListener {
            val soru1 =binding.tvKacYasindasiniz.text.toString()
            val soru2 =binding.tvNerelisiniz.text.toString()
            val soru3 =binding.tvMesleginizNedir.text.toString()
            val info = Info(personalInfo,soru1,soru2,soru3)

            val action =
                com.handearslan.navigationcomponenthomework.ui.CustomFragmentDirections.customtoresult(
                    info
                )
            findNavController().navigate(action)
        }
    }
}