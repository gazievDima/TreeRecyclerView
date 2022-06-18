package com.gaziev.treerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gaziev.treerecyclerview.databinding.ActivityMainBinding
import com.gaziev.treerecyclerview.list.root.RootAdapter
import com.gaziev.treerecyclerview.list.model.Child
import com.gaziev.treerecyclerview.list.model.Root

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val children: List<Child> = listOf(
        Child("File 1"),
        Child("File 2"),
        Child("File 3"),
        Child("File 4"),
    )

    private val rootGroup: List<Root> = listOf(
        Root("Folder 1", children),
        Root("Folder 2", children),
        Root("Folder 3", children),
        Root("Folder 4", children),
        Root("Folder 5", children),
        Root("Folder 6", children),
        Root("Folder 7", children),
        Root("Folder 8", children),
        Root("Folder 9", children),
        Root("Folder 10", children),
        Root("Folder 11", children),
        Root("Folder 12", children),
        Root("Folder 13", children),
        Root("Folder 14", children),
        Root("Folder 15", children),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.recyclerItems.layoutManager =
            LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        binding.recyclerItems.adapter = RootAdapter(rootGroup)
    }
}