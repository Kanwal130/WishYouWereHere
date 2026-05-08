package com.example.wishyouwerehere

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Place(
    val name: String,
    val location: String,
    val dateVisited: String,
    val rating: Float,
    val imageResId: Int
) : Parcelable
