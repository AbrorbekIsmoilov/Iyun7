package com.abrorbek_uz.iyun7.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abrorbek_uz.iyun7.databinding.ItemRvBinding
import com.abrorbek_uz.iyun7.models.Data


class Adapter(val list: ArrayList<Data>, val context: Context) :
    RecyclerView.Adapter<Adapter.Vh>() {
    inner class Vh(val itemRvBinding: ItemRvBinding) : RecyclerView.ViewHolder(itemRvBinding.root) {
        fun onBind(data: Data, position: Int) {
            itemRvBinding.movieName.text = data.movieName

            itemRvBinding.movieData.text = data.relesezData

    }


}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
         return list.size
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position], position)
    }
}