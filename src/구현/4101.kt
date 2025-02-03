package 구현

fun main (){
    while (true){
        val (a, b) = readln().split(" ").map { it.toInt() }
        if (a == 0 && b == 0) break
        val c = if (a > b) "Yes" else "No"
        println(c)

    }
}