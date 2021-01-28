package com.Daniel

fun main() {
    //println("Hello Kotlin")
    //Human().hello()
    val h=Human()
    h.hello();
    val age=10; //val 定義不會改變的值
    //val age : Int =10 分號後可自行指定資料型態
    var weight = 66.5 //var 定義可改變的值
    var name : String //只定義不給值時需冒號並補上資料型態
}


class Human{
    fun hello(){
        println("Hello kotlin")
    }
}