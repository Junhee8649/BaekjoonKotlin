package 수학

import java.math.BigInteger

fun main(){
    val (a, b) = readln().split(" ").map { BigInteger(it) }
    println(a + b)
}