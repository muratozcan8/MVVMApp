package com.muratozcan.mvvmproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.muratozcan.mvvmproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.textViewResult.text = "0"

        binding.buttonSum.setOnClickListener {
            val number1str = binding.editTextNumber1.text.toString()
            val number2str = binding.editTextNumber2.text.toString()

            val number1 = number1str.toInt()
            val number2 = number2str.toInt()
            val sum = number1 + number2

            binding.textViewResult.text = sum.toString()

        }

        binding.buttonMultiplication.setOnClickListener {
            val number1str = binding.editTextNumber1.text.toString()
            val number2str = binding.editTextNumber2.text.toString()

            val number1 = number1str.toInt()
            val number2 = number2str.toInt()
            val mult = number1 * number2

            binding.textViewResult.text = mult.toString()

        }
    }
}