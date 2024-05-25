package com.example.arcadeshootemuphystoria.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.arcadeshootemuphystoria.data.AshAutomatData
import com.example.arcadeshootemuphystoria.data.AshInfoFragData
import com.example.arcadeshootemuphystoria.data.AshTippsData
import com.example.arcadeshootemuphystoria.data.AshautomatHaupt
import com.example.arcadeshootemuphystoria.data.AshkategorieData

class SharedViewModel: ViewModel() {

private var _primeobserver = MutableLiveData<AshautomatHaupt>()
    val primeobserver : LiveData<AshautomatHaupt>
        get() = _primeobserver

private var _katobserver = MutableLiveData<AshkategorieData>()
val katobserver : LiveData<AshkategorieData>
    get() = _katobserver

private var _infoobserver = MutableLiveData<AshInfoFragData>()
    val infoobserver : LiveData<AshInfoFragData>
        get() = _infoobserver

private var _tippsobserver = MutableLiveData<AshTippsData>()
val tippsobserver : LiveData<AshTippsData>
    get() = _tippsobserver

private var _ashAutomatSelected = MutableLiveData<AshAutomatData>()
val ashAutomatSelected: LiveData<AshAutomatData>
    get() = _ashAutomatSelected


    fun setSelectedItem(item: AshAutomatData){
       _ashAutomatSelected.value = item
    }


}