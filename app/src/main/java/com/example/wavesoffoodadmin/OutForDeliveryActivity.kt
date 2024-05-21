package com.example.wavesoffoodadmin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wavesoffoodadmin.Adapter.DeliveryAdapter
import com.example.wavesoffoodadmin.databinding.ActivityOutForActivityBinding

class OutForDeliveryActivity : AppCompatActivity() {
    private val binding: ActivityOutForActivityBinding by lazy{
        ActivityOutForActivityBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.BackButton.setOnClickListener{
            finish()
        }

        val customerName = arrayListOf(
            "Duc Duy",
            "Duy Phat",
            "A Tien",
        )
        val moneyStatus = arrayListOf(
            "received",
            "notReceived",
            "pending",
        )

        val adapter = DeliveryAdapter(customerName,moneyStatus)
        binding.deliveryRecyclerView.adapter = adapter
        binding.deliveryRecyclerView.layoutManager = LinearLayoutManager(this)

    }
}