package com.kelompok5.mitahara.utils

interface ItemClickListener<T> {
    fun onClick(data : T, position : Int)
}