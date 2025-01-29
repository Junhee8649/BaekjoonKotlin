package 수학

fun main(){
    val a = readln().toInt()
    val (w, v) = readln().split(" ").map { it.toInt() }
    val currentAmpere = w / v
    if (currentAmpere >= a) println(1) else println(0)
}