package com.muratozcan.mvvmproject

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivityViewModel : ViewModel() {

    var result = MutableLiveData("0")
    var mrepo = MathRepository()
    fun sum(number1str:String, number2str:String){
        CoroutineScope(Dispatchers.Main).launch {
            result.value = mrepo.sum(number1str, number2str)
        }
    }

    fun mult(number1str:String, number2str:String){
        CoroutineScope(Dispatchers.Main).launch {
            result.value = mrepo.mult(number1str, number2str)
        }
    }
}