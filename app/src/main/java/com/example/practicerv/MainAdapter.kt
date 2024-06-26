package com.example.practicerv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.practicerv.databinding.ItemRvBinding

class MainAdapter(private val mainList: List<java.lang.String>) :
    RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    class MainViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val binding = ItemRvBinding.bind(item)
        fun bind(main: String) {
            binding.itemText.text = main
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.MainViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_rv, parent, false)
        val viewHolder = MainViewHolder(view)
        view.setOnClickListener {
            val position = viewHolder.adapterPosition

        }
        return viewHolder
    }

    override fun getItemCount(): Int {
        return mainList.size
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(mainList[position].toString())
    }

}