package 수학

import kotlin.math.sqrt

fun main(){
    val (d, h, w) = readln().split(" ").map { it.toInt() }
    val x: Double = sqrt((d*d).toDouble() / (h*h + w*w).toDouble())
    println("${(h*x).toInt()} ${(w*x).toInt()}" )
}