package com.eman.challenge.presentation.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.eman.challenge.R
import com.eman.challenge.databinding.RowCharacterBinding
import com.eman.challenge.domain.model.BaseModelMarvel
import com.eman.challenge.presentation.NavigationListener

class MainCharacterAdapter(
    private var characters: List<BaseModelMarvel>,
    var listener: NavigationListener
) :
    RecyclerView.Adapter<MainCharacterAdapter.DataViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val binding = DataBindingUtil.inflate<RowCharacterBinding>(
            LayoutInflater.from(parent.context),
            R.layout.row_character,
            parent,
            false
        )
        return DataViewHolder(binding)
    }

    override fun getItemCount(): Int = characters.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.binding.marvelOut = characters.get(position)
        holder.binding.nListener = listener
        holder.binding.itemView.setOnClickListener { view ->
            listener.onClickCharacter(view,characters.get(position).id!! )
        }
    }

    class DataViewHolder(val binding: RowCharacterBinding) : RecyclerView.ViewHolder(binding.root)

    fun addData(list: List<BaseModelMarvel>) {
        characters = (list)
    }


}