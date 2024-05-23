package com.example.arcadeshootemuphystoria.ui

import android.graphics.ImageDecoder
import android.graphics.drawable.AnimatedImageDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.arcadeshootemuphystoria.R
import com.example.arcadeshootemuphystoria.databinding.FragmentKategorieBinding

class KategorieFragment : Fragment() {

    private lateinit var binding: FragmentKategorieBinding

    //private val viewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentKategorieBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val source = ImageDecoder.createSource(
           resources, R.drawable.axelaygif
        )
        val drawable = ImageDecoder.decodeDrawable(source)

        val imageView = binding.kastengif
        imageView.setImageDrawable(drawable)
        (drawable as? AnimatedImageDrawable)?.start()

    }
}
