//package com.eman.challenge.presentation.ui.main.pagingadaptertest
//
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.databinding.DataBindingUtil
//import androidx.paging.PagedListAdapter
//import androidx.recyclerview.widget.DiffUtil
//import androidx.recyclerview.widget.RecyclerView
//import com.eman.challenge.R
//import com.eman.challenge.databinding.ItemBusinessBinding
//import com.eman.challenge.presentation.NavigationListener
//
//class MainPagingAdapter(
//    private var businesses: ArrayList<Character>,
//    var listener: NavigationListener
//) : PagedListAdapter<Character, MainPagingAdapter.DataViewHolder>(MovieDiffCallback()) {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
//        val binding = DataBindingUtil.inflate<ItemBusinessBinding>(
//            LayoutInflater.from(parent.context),
//            R.layout.item_search,
//            parent,
//            false
//        )
//        return DataViewHo@lder(binding)
//    }
//
//    override fun getItemCount(): Int = businesses.size
//
//    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
//        holder.binding.businessApi = businesses.get(position)
//        holder.binding.listener = listener
//    }
//
//    class DataViewHolder(val binding: ItemBusinessBinding) : RecyclerView.ViewHolder(binding.root)
//
//    fun addData(list: ArrayList<Character>) {
//        businesses=(list)
//    }
//
//    class MovieDiffCallback : DiffUtil.ItemCallback<Character>() {
//        override fun areItemsTheSame(oldItem: Character, newItem: Character): Boolean {
//            return oldItem.id == newItem.id
//        }
//
//        override fun areContentsTheSame(oldItem: Character, newItem: Character): Boolean {
//            return oldItem == newItem
//        }
//
//    }
//}