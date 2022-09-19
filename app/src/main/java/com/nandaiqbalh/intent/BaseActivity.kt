package com.nandaiqbalh.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.nandaiqbalh.intent.databinding.ActivityBaseBinding

class BaseActivity : AppCompatActivity() {

    private var _binding: ActivityBaseBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityBaseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnData.setOnClickListener {

            val stringInput = binding.edtTeks.text.toString()

            val dataIntent = Intent(this@BaseActivity, TargetActivity::class.java)
            dataIntent.putExtra("data", stringInput)
            dataIntent.putExtra("int", 12)

            startActivity(dataIntent)
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}