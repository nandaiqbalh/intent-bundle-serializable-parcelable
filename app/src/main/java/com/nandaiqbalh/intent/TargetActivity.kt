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

        // data
        binding.tv1.text = intent.getStringExtra("data")

        // bundle
        val bundle = intent.extras
        binding.tv1.text = bundle?.getString("edt_satu")
        binding.tvDua.text = bundle?.getInt("integer").toString()
        binding.tvTiga.text = bundle?.getDouble("double").toString()
        binding.tvEmpat.text = bundle?.getString("string")
        binding.tvLima.text = bundle?.getBoolean("boolean").toString()

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}