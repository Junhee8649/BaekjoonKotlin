package 수학

fun main(){
    val (a, b) = readln().split(" ").map { it.toInt() }
    val realDamage = a - (a * b / 100.0)
    if (realDamage >= 100) print(0) else print(1)
}