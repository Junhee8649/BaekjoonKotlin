package 수학

fun main(){
    val count = readln().toInt()
    var exclude = 0
    repeat(count){
        val num = readln().toInt()
        if (num % 2 != 0) exclude++
    }
    println(exclude)
}