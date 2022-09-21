package com.nandaiqbalh.intent

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Student(
    var name: String,
    var age: Int
) : Parcelable