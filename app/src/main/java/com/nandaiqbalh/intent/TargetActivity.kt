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
        intent.getStringExtra("data")?.let {
            binding.tv1.text = intent.getStringExtra("data")

        }

        // bundle
        intent.extras?.getString("string")?.let {
            val bundle = intent.extras
            binding.tv1.text = bundle?.getString("edt_satu")
            binding.tvDua.text = bundle?.getInt("integer").toString()
            binding.tvTiga.text = bundle?.getDouble("double").toString()
            binding.tvEmpat.text = bundle?.getString("string")
            binding.tvLima.text = bundle?.getBoolean("boolean").toString()
        }

        // serializable
        intent.getSerializableExtra("OBJECT_1")?.let {
            val person1 = intent.getSerializableExtra("OBJECT_1") as Person
            val person2 = intent.getSerializableExtra("OBJECT_2") as Person

            binding.tv1.text = "Hi ${person1.name}, email kamu adalah ${person1.email}!"
            binding.tvDua.text = "Hi ${person2.name}, email kamu adalah ${person2.email}!"
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}