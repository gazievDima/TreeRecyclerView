package com.gaziev.treerecyclerview.list.root

import android.view.View
import androidx.core.view.children
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gaziev.treerecyclerview.R
import com.gaziev.treerecyclerview.databinding.ItemRootBinding
import com.gaziev.treerecyclerview.list.child.ChildAdapter
import com.gaziev.treerecyclerview.list.model.Root

class RootHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val binding: ItemRootBinding by lazy {
        ItemRootBinding.bind(itemView)
    }
    private var state: Boolean = false

    fun bind(el: Root, show: Boolean) {
        state = show
        if (!state) closeFolder()
        initRecyclerChild(el)
        initClickListeners()
    }

    private fun initRecyclerChild(el: Root) {
        binding.apply {
            recyclerChild.layoutManager =
                LinearLayoutManager(itemView.context, RecyclerView.VERTICAL, false)
            recyclerChild.adapter = ChildAdapter(el.children)

            tvTitle.text = el.title
        }
    }

    private fun initClickListeners() {
        for (view in binding.containerTitle.children) {
            view.setOnClickListener {
                if (state) openFolder() else closeFolder()
            }
        }
    }

    private fun openFolder() {
        binding.ibPicture.setImageResource(R.drawable.ic_baseline_folder_open_24)
        binding.recyclerChild.visibility = View.VISIBLE
        state = !state
    }

    private fun closeFolder() {
        binding.ibPicture.setImageResource(R.drawable.ic_baseline_folder_24)
        binding.recyclerChild.visibility = View.GONE
        state = !state
    }
}