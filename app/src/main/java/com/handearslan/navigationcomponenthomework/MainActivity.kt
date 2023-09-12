package com.handearslan.navigationcomponenthomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.handearslan.navigationcomponenthomework.common.viewBinding
import com.handearslan.navigationcomponenthomework.databinding.ActivityMainBinding
//HANDE ARSLAN
class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }
}



