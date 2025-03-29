package 수학

import java.math.BigDecimal
import java.math.MathContext
import java.math.RoundingMode

fun main(){
    val (a, b, c) = readln().split(" ").map { BigDecimal(it) }
    val precision = 100
    println((a*b).divide(c, MathContext(precision, RoundingMode.HALF_UP)))
}