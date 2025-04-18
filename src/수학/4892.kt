package 수학

fun main(){
    var case = 1
    while (true){
        val num = readln().toInt()
        if (num == 0) return

        val n1 = 3 * num
        val n2 = if (n1 % 2 == 0) n1 / 2 else (n1 + 1) / 2
        val n3 = 3 * n2
        val n4 = n3 / 9

        println(if (n1 % 2 == 0) "$case. even $n4" else "$case. odd $n4")
        case++
    }
}