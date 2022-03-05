package com.example.appalkemy.interfaceUsuario.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.example.appalkemy.databinding.PopularMoviesRowBinding
import com.example.appalkemy.nucleo.ConcatHolderBase

class PeliculasConcatAdapter(private val peliculaAdapter: PeliculaAdapter):RecyclerView.Adapter<ConcatHolderBase<*>>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConcatHolderBase<*> {
        val binding = PopularMoviesRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ConcatViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ConcatHolderBase<*>, position: Int) {
        when(holder){
            is ConcatViewHolder -> holder.bindeo(peliculaAdapter)
        }
    }

    override fun getItemCount(): Int = 1

    private inner class ConcatViewHolder(val binding: PopularMoviesRowBinding):ConcatHolderBase<PeliculaAdapter>(binding.root) {
        override fun bindeo(adapter: PeliculaAdapter) {
            binding.rvPopularMovies.adapter = adapter
        }
    }
}