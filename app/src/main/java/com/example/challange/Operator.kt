package com.example.challange

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Operator(
    val name: String,
    val description: String,
    val photo: String
) : Parcelable