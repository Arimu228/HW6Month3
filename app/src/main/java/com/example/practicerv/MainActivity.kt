package com.example.practicerv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.practicerv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var rvView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        rvView = binding.rvView
        loadData()
        val layoutManager = LinearLayoutManager(this)
        rvView.layoutManager = layoutManager

        setContentView(binding.root)
    }

    private fun loadData() {
        val dataList = listOf(
            java.lang.String("Item 1"),
            java.lang.String("Item 2"),
            java.lang.String("Item 2"),
            java.lang.String("Item 2"),
            java.lang.String("Item 3"),
            java.lang.String("Item 3"),
            java.lang.String("Item 3"),
            java.lang.String("Item 3"),
            java.lang.String("Item 4"),
            java.lang.String("Item 4"),
            java.lang.String("Item 4"),
            java.lang.String("Item 4"),
            java.lang.String("Item 4"),
            java.lang.String("Item 4"),
            java.lang.String("Item 4"),
            java.lang.String("Item 4"),
            java.lang.String("Item 5"),
            java.lang.String("Item 6"),
            java.lang.String("Item 6"),
            java.lang.String("Item 6"),
            java.lang.String("Item 6"),
            java.lang.String("Item 6"),
            java.lang.String("Item 6"),
            java.lang.String("Item 6"),
            java.lang.String("Item 7"),
            java.lang.String("Item 7"),
            java.lang.String("Item 7"),
            java.lang.String("Item 7"),
            java.lang.String("Item 8"),
            java.lang.String("Item 9"),
            java.lang.String("Item 10")
        )
        val adapter = MainAdapter(dataList)
        rvView.adapter = adapter
    }
}