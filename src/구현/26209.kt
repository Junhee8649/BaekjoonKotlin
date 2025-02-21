package 구현

fun main(){
    val list = readln().split(" ").map { it.toInt() }
    val answer = if (list.contains(9)) "F" else "S"
    println(answer)
}