package 수학

import java.math.BigInteger

fun main(){
    val (n, m) = readln().split(" ").map { BigInteger(it) }
    println(factorial(n) / factorial(n - m) / factorial(m))
}

fun factorial(n: BigInteger): BigInteger {
    return if (n == BigInteger.ONE) BigInteger.ONE
    else n * factorial(n - BigInteger.ONE)
}