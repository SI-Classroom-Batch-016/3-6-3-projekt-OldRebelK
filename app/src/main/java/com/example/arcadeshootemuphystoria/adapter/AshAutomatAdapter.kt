package com.example.arcadeshootemuphystoria.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.arcadeshootemuphystoria.data.AshAutomatData
import com.example.arcadeshootemuphystoria.databinding.ItemArcadeListBinding

class AshAutomatAdapter(
    private val dataset: List<AshAutomatData>,
    private val itemClickListener: (AshAutomatData) -> Unit
) : RecyclerView.Adapter<AshAutomatAdapter.ItemViewholder>() {

    inner class ItemViewholder(val binding: ItemArcadeListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: AshAutomatData) {
            binding.arcadespielIV.setImageResource(item.spielScreen)
            binding.arcadespielLogoIV.setImageResource(item.spielLogo)
            binding.iconIV.setImageResource(item.spielIcon)
            binding.root.setOnClickListener {
                itemClickListener(item)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewholder {
        val binding = ItemArcadeListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewholder(binding)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: ItemViewholder, position: Int) {
        val item = dataset[position]
        holder.bind(item)
    }
}