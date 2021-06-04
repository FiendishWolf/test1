package chapter2

import java.lang.Exception

fun main() {
    var sum: Int = 0
    for (i in 1 ..10){
        println(i)
        sum = sum + i
    }
    println(sum)
    val list: List<Int> = listOf(1, 2, 3)
    for (element in list) {
        println(element)
    }
    val range: IntRange = 1..10
    range.first
    range.last

    var i = 0
    while (i<=5){
        println(i)
        i = i + 1
    }
    var j = 0
    while (true){
        println(j)
        if (j>=5){
            break
        }
        j = j + 1
    }
    try {
        val error = 5 / 0
        val success = 5 / 1
    } catch (e: Exception){
        //e.printStackTrace()
        println("Error")
    } finally {
        println("finally")
    }
   println("Complete")
}