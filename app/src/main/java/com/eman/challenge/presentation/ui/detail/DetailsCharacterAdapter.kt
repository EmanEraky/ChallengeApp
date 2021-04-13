package com.eman.challenge.presentation.ui.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.eman.challenge.R
import com.eman.challenge.databinding.ItemDetailBinding
import com.eman.challenge.databinding.RowCharacterBinding
import com.eman.challenge.domain.model.Items

class DetailsCharacterAdapter(
    private var marvels: List<Items>
) :
    RecyclerView.Adapter<DetailsCharacterAdapter.DataViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val binding = DataBindingUtil.inflate<ItemDetailBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_detail,
            parent,
            false
        )
        return DataViewHolder(binding)
    }

    override fun getItemCount(): Int = marvels.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        val item = marvels.get(position)
//        marvels
        holder.binding.itemsMarvel = marvels.get(position)

    }

    class DataViewHolder(val binding: ItemDetailBinding) : RecyclerView.ViewHolder(binding.root)

    fun addData(list: ArrayList<Items>) {
        marvels=(list)
    }


}