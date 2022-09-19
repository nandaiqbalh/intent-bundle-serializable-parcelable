package com.nandaiqbalh.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nandaiqbalh.intent.databinding.ActivityBaseBinding

class BaseActivity : AppCompatActivity() {

    private var _binding: ActivityBaseBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityBaseBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}