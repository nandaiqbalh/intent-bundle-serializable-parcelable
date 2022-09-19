package com.nandaiqbalh.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nandaiqbalh.intent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding : ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnImplicit.setOnClickListener {
            implicitIntent()
        }

        binding.btnExplicit.setOnClickListener {

            val toBaseIntent = Intent(this@MainActivity, BaseActivity::class.java)
            startActivity(toBaseIntent)

        }
    }

    // implicit intent
    private fun implicitIntent(){

        val stringMessage = "Hi, there!"

        val sendIntent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, stringMessage)
            type = "text/plain"
        }

        if (sendIntent.resolveActivity(packageManager) != null){
            startActivity(sendIntent)
        }


    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}