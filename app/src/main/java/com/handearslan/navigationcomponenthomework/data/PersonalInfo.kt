package com.handearslan.navigationcomponenthomework.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PersonalInfo(
    val adSoyad: String,
    val email:String,
    val sifre:String,
    val phone:String
) : Parcelable
