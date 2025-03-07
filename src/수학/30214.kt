package 수학

fun main(){
    val (a, b) = readln().split(" ").map { it.toInt() }
    if (a * 2 >= b) println("E") else println("H")
}