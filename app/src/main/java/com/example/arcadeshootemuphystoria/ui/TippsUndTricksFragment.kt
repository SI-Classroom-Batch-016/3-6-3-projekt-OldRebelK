package com.example.arcadeshootemuphystoria.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.arcadeshootemuphystoria.R
import com.example.arcadeshootemuphystoria.data.AshAutomatData
import com.example.arcadeshootemuphystoria.databinding.FragmentTippsundTricksBinding


class TippsUndTricksFragment : Fragment() {

    private lateinit var binding: FragmentTippsundTricksBinding

    private val viewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTippsundTricksBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data: AshAutomatData = viewModel.ashAutomatSelected.value!!

        binding.tutTextTV.text = data.tippsData.tippsText
        binding.TuTIconIV.setImageResource(data.tippsData.icon)

        binding.backBTN.setOnClickListener {
            findNavController().navigate(R.id.kategorieFragment)
        }
        binding.arcadeBTN.setOnClickListener {
            findNavController().navigate(R.id.spielAuswahlFragment)
        }
    }
}