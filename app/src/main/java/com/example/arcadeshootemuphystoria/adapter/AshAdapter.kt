package com.example.arcadeshootemuphystoria.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.arcadeshootemuphystoria.data.AshAutomatData
import com.example.arcadeshootemuphystoria.databinding.ItemArcadeListBinding

class AshAdapter (val dataset: List<AshAutomatData>): RecyclerView.Adapter<AshAdapter.ItemViewholder>(){

    inner class ItemViewholder(val binding: ItemArcadeListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewholder {
        val binding = ItemArcadeListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewholder(binding)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: ItemViewholder, position: Int) {
        val item = dataset[position]
        holder.binding.arcadespielIV.setImageResource(item.spielScreen)
        holder.binding.arcadespielLogoIV.setImageResource(item.spielLogo)
        holder.binding.iconIV.setImageResource(item.spielIcon)

    }

}