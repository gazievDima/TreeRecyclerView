package com.gaziev.treerecyclerview.list.child

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gaziev.treerecyclerview.R
import com.gaziev.treerecyclerview.list.model.Child

class ChildAdapter(
    private val listChildren: List<Child>
) : RecyclerView.Adapter<ChildHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_child, parent, false)
        return ChildHolder(view)
    }

    override fun onBindViewHolder(holder: ChildHolder, position: Int) =
        holder.bind(listChildren[position])

    override fun getItemCount(): Int = listChildren.size
}