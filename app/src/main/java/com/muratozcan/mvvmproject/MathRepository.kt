package com.muratozcan.mvvmproject

class MathRepository {
    var mds = MathDataSource()

    suspend fun sum(number1str:String, number2str:String) : String
    = mds.sum(number1str, number2str)





    suspend fun mult(number1str:String, number2str:String) : String
    = mds.mult(number1str, number2str)

}