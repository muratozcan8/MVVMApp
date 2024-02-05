package com.muratozcan.mvvmproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.muratozcan.mvvmproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainActivityViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.mainActivityObject = this

        viewModel.result.observe(this) {
            binding.calculateResult = it
        }
    }

    fun buttonSumClick(number1str:String, number2str:String){
        viewModel.sum(number1str, number2str)
    }

    fun buttonMultClick(number1str:String, number2str:String){
        viewModel.mult(number1str, number2str)
    }
}