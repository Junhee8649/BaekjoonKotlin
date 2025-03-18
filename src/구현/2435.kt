package 구현

fun main(){
    val (n, k) = readln().trim().split(" ").map { it.toInt() }
    val temperature = readln().trim().split(" ").map { it.toInt() }
    val sumTemp = mutableListOf<Int>()

    for (i in 0..n-k){
        var sum = 0
        for (j in i ..< i+k){
            sum += temperature[j]
        }
        sumTemp.add(sum)
    }
    println(sumTemp.max())
}