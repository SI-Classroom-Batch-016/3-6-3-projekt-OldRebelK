package com.example.arcadeshootemuphystoria.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.arcadeshootemuphystoria.data.AshAutomatData

class SharedViewModel: ViewModel() {

private var _ashAutomatSelected = MutableLiveData<AshAutomatData>()
val ashAutomatSelected: LiveData<AshAutomatData>
    get() = _ashAutomatSelected


    fun setSelectedItem(item: AshAutomatData){
       _ashAutomatSelected.value = item
    }
}