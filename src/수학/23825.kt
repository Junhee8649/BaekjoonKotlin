package 수학

fun main(){
    val (s,a) = readln().split(" ").map { it.toInt() }
    if(s < a) print(s / 2) else print(a / 2)
}