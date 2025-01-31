package 수학

import kotlin.math.abs

fun main(){
    val (C, B, P) = readln().split(" ").map { it.toInt() }
    val (c, b, p) = readln().split(" ").map { it.toInt() }
    val x = if(c > C) abs(c - C) else 0
    val y = if(b > B) abs(b - B) else 0
    val z = if(p > P) abs(p - P) else 0
    println(x+y+z)
}