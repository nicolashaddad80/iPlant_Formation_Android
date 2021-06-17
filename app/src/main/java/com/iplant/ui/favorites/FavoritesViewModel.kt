package com.iplant.ui.favorites

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FavoritesViewModel : ViewModel() {

    val text = MutableLiveData<String>().apply {
        value = "This is favorites Fragment"
    }

}