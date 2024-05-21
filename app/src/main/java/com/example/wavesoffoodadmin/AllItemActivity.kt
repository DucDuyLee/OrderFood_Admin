package com.example.wavesoffoodadmin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wavesoffoodadmin.Adapter.AddItemAdapter
import com.example.wavesoffoodadmin.databinding.ActivityAllItemBinding

class AllItemActivity : AppCompatActivity() {
    private val binding: ActivityAllItemBinding by lazy{
        ActivityAllItemBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.BackButton.setOnClickListener{
            finish()
        }
        val menuFoodName = listOf("Burger S", "Crab 500g", "Cream S", "Soup Mini", "Potato S", "Sandwich S",
                            "Crab 1kg", "Cream M", "Soup Normal", "Potato M", "Sandwich M",
                            "Burger L", "Crab Big Size", "Cream L", "Soup Big Size", "Potato L", "Sandwich L")
        val menuItemPrice = listOf("$10", "$35", "$5", "$10", "$8", "$10",
                            "$69", "$6", "$15", "$10", "$15",
                            "$15", "$90", "$7", "$20", "$12", "$20")
        val menuImage = listOf(
            R.drawable.menu1, R.drawable.menu2, R.drawable.menu3, R.drawable.menu4, R.drawable.menu5, R.drawable.menu6,
            R.drawable.menu2, R.drawable.menu3, R.drawable.menu4, R.drawable.menu5, R.drawable.menu6,
            R.drawable.menu1, R.drawable.menu2, R.drawable.menu3, R.drawable.menu4, R.drawable.menu5, R.drawable.menu6,
        )
        val adapter = AddItemAdapter(
            ArrayList(menuFoodName),
            ArrayList(menuItemPrice),
            ArrayList(menuImage)
        )
        binding.MenuRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.MenuRecyclerView.adapter = adapter
    }
}