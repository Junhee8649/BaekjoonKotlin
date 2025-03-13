package 수학

fun main(){
    val n = readln().toInt()
    var count = 0
    val time = readln().split(" ").map { it.toInt() }
    for (i in time){
        count += (i+8)
    }
    count -= 8
    println("${count/24} ${count%24}")
}