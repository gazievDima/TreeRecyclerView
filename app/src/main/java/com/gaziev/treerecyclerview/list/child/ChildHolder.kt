package com.gaziev.treerecyclerview.list.child

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.gaziev.treerecyclerview.databinding.ItemChildBinding
import com.gaziev.treerecyclerview.list.model.Child

class ChildHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val binding: ItemChildBinding by lazy {
        ItemChildBinding.bind(itemView)
    }
    fun bind(el: Child) {
        binding.tvContent.text = el.content
    }
}