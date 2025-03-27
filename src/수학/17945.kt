package 수학

import kotlin.math.sqrt

fun main(){
    val (a, b) = readln().split(" ").map { it.toInt() }
    val x1 = (sqrt((a*a - b).toDouble()) - a).toInt()
    val x2 = (-sqrt((a*a - b).toDouble()) - a).toInt()

    when{
        x1 < x2 -> println("$x1 $x2")
        x1 > x2 -> println("$x2 $x1")
        else -> println(x1)
    }
}