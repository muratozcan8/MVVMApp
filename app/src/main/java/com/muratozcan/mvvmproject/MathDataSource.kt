package com.muratozcan.mvvmproject

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MathDataSource {
    suspend fun sum(number1str:String, number2str:String) : String =
        withContext(Dispatchers.IO) {
            val number1 = number1str.toInt()
            val number2 = number2str.toInt()
            val sum = number1 + number2
            return@withContext sum.toString()
        }

    suspend fun mult(number1str:String, number2str:String) : String =
        withContext(Dispatchers.IO){
            val number1 = number1str.toInt()
            val number2 = number2str.toInt()
            val mult = number1 * number2
            return@withContext mult.toString()
        }

}