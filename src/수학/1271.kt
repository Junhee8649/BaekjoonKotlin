package 수학

import java.math.BigInteger

fun main(){
    val (money, life) = readln().split(" ").map { BigInteger(it) }
    println("${money / life}\n${money % life}")
}