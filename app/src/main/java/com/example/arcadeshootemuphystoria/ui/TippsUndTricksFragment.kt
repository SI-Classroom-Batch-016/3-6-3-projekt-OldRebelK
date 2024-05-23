package com.example.arcadeshootemuphystoria.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.arcadeshootemuphystoria.R
import com.example.arcadeshootemuphystoria.databinding.FragmentTippsundTricksBinding


class TippsUndTricksFragment : Fragment() {

    private lateinit var binding: FragmentTippsundTricksBinding

    //private val viewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTippsundTricksBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.backBTN.setOnClickListener {
            findNavController().navigate(R.id.kategorieFragment)
        }
        binding.arcadeBTN.setOnClickListener {
            findNavController().navigate(R.id.spielAuswahlFragment)
        }
    }
}