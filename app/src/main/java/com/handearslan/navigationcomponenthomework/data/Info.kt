package com.handearslan.navigationcomponenthomework.data
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Info(
    val personalInfo: PersonalInfo,
    val soru1: String,
    val soru2: String,
    val soru3: String
) : Parcelable
