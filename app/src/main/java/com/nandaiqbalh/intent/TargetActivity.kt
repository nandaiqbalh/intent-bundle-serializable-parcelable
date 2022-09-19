package com.nandaiqbalh.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nandaiqbalh.intent.databinding.ActivityTargetBinding

class TargetActivity : AppCompatActivity() {

    private var _binding : ActivityTargetBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityTargetBinding.inflate(layoutInflater)
        setContentView(binding.root)


            binding.tv1.text = intent.getStringExtra("data")

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}