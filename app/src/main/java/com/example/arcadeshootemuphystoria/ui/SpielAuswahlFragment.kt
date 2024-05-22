package com.example.arcadeshootemuphystoria.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.arcadeshootemuphystoria.R
import com.example.arcadeshootemuphystoria.adapter.AshAdapter
import com.example.arcadeshootemuphystoria.data.AshAutomatData
import com.example.arcadeshootemuphystoria.data.Ashdatasource
import com.example.arcadeshootemuphystoria.databinding.FragmentSpielAuswahlBinding

class SpielAuswahlFragment : Fragment() {

    private lateinit var binding: FragmentSpielAuswahlBinding

    //private val viewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSpielAuswahlBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data: List<AshAutomatData> = Ashdatasource.arcade

        val adapter = AshAdapter(data)
        binding.arcadeRotation.adapter = adapter
    }
}