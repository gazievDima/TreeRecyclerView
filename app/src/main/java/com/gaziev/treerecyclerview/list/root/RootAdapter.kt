package com.gaziev.treerecyclerview.list.root

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gaziev.treerecyclerview.R
import com.gaziev.treerecyclerview.list.model.Root

class RootAdapter(
    private val listRootGroup: List<Root>
) : RecyclerView.Adapter<RootHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RootHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_root, parent, false)
        return RootHolder(view)
    }

    override fun onBindViewHolder(holder: RootHolder, position: Int) =
        holder.bind(listRootGroup[position], false)

    override fun getItemCount(): Int = listRootGroup.size
}



