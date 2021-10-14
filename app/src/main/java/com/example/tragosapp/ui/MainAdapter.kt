package com.example.tragosapp.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tragosapp.R
import com.example.tragosapp.base.BaseViewHolder
import com.example.tragosapp.data.model.Drink
import com.example.tragosapp.databinding.TragosRowBinding

class MainAdapter(
    private val context: Context,
    private val tragosList: List<Drink>,
    private val itemClickListener: OnTragoClickListener
) :
    RecyclerView.Adapter<BaseViewHolder<*>>() {

    interface OnTragoClickListener {
        fun onTragoClick(drink: Drink)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        val binding = TragosRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        when (holder) {
            is MainViewHolder -> holder.bind(tragosList[position], position)
        }
    }

    override fun getItemCount(): Int {
        return tragosList.size
    }

    inner class MainViewHolder(val binding: TragosRowBinding) :
        BaseViewHolder<Drink>(binding.root) {
        override fun bind(item: Drink, position: Int) {


            Glide.with(context).load(item.imagen).centerCrop().into(binding.imgTrago)
            binding.txtTitulo.text = item.nombre
            binding.txtDescripcion.text = item.descripcion
            binding.root.setOnClickListener { itemClickListener.onTragoClick(item) }
        }

    }

}