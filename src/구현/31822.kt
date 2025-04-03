package 구현

fun main(){
    val code = readln()
    val n = readln().toInt()
    var count = 0
    repeat(n){
        val newCode = readln()
        if (code.substring(0, 5) == newCode.substring(0, 5)) count++
    }
    println(count)
}