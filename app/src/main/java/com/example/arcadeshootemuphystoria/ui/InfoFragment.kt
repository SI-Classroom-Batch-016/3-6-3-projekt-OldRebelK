package com.example.arcadeshootemuphystoria.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.arcadeshootemuphystoria.R
import com.example.arcadeshootemuphystoria.databinding.FragmentInfoBinding

class InfoFragment : Fragment() {

    private lateinit var binding: FragmentInfoBinding

    //private val viewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInfoBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.backBTN2.setOnClickListener {
            findNavController().navigate(R.id.kategorieFragment)
        }
        binding.arcadeBTN2.setOnClickListener {
            findNavController().navigate(R.id.spielAuswahlFragment)
        }
    }
}
