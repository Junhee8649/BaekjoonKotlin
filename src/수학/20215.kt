package 수학

import kotlin.math.sqrt

fun main(){
    val (w, h) = readln().split(" ").map { it.toInt() }
    val diagonal = sqrt((w*w + h*h).toDouble())

    println(w + h - diagonal)
}