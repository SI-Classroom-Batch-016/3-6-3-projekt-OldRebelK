package com.example.arcadeshootemuphystoria.ui

import android.graphics.ImageDecoder
import android.graphics.drawable.AnimatedImageDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.arcadeshootemuphystoria.R
import com.example.arcadeshootemuphystoria.data.AshAutomatData
import com.example.arcadeshootemuphystoria.data.Ashdatasource
import com.example.arcadeshootemuphystoria.data.AshkategorieData
import com.example.arcadeshootemuphystoria.databinding.FragmentKategorieBinding

class KategorieFragment : Fragment() {

    private lateinit var binding: FragmentKategorieBinding

    private val viewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentKategorieBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data: AshAutomatData = viewModel.ashAutomatSelected.value!!

        val source = ImageDecoder.createSource(
           resources, data.kategorie.gifs
        )
        val drawable = ImageDecoder.decodeDrawable(source)

        val imageView = binding.kastengif
        imageView.setImageDrawable(drawable)
        (drawable as? AnimatedImageDrawable)?.start()

        binding.shipiconIV.setImageResource(data.kategorie.icon)

        binding.gueBTN.setOnClickListener{
            findNavController().navigate(R.id.infoFragment)
        }
        binding.tutBTN.setOnClickListener {
            findNavController().navigate(R.id.tippsUndTricksFragment)
        }
        binding.katbackBTN.setOnClickListener {
            findNavController().navigate(R.id.spielAuswahlFragment)
        }
    }
}
