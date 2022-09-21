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

        binding.btnBundle.setOnClickListener {

            val stringInput = binding.edtTeks.text.toString()

            val bundleIntent = Intent(this@BaseActivity, TargetActivity::class.java)

            // declare bundle
            val bundle = Bundle()

            bundle.putString("edt_satu", stringInput)
            bundle.putInt("integer", 12)
            bundle.putDouble("double", 12.2)
            bundle.putString("string", "Nanda")
            bundle.putBoolean("boolean", true)

            bundleIntent.putExtras(bundle)
            startActivity(bundleIntent)

        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}