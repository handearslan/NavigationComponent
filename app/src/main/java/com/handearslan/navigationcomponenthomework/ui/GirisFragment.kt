package com.handearslan.navigationcomponenthomework.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.handearslan.navigationcomponenthomework.R
import com.handearslan.navigationcomponenthomework.common.viewBinding
import com.handearslan.navigationcomponenthomework.databinding.FragmentGirisBinding

class GirisFragment : Fragment(R.layout.fragment_giris) {

    private val binding by viewBinding(FragmentGirisBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBasla.setOnClickListener {
            val adSoyad = binding.etAdSoyad.text.toString()

            val action =
                com.handearslan.navigationcomponenthomework.ui.GirisFragmentDirections.giristoKisiselBilgiler(
                    adSoyad
                )
            findNavController().navigate(action)

        }
    }
}
