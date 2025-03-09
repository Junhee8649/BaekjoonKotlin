package 수학

import kotlin.math.sqrt

fun main(){
    val (n, k) = readln().split(" ").map { it.toInt() }
    if (findDivisor(n).size < k) print(0) else print(findDivisor(n)[k-1])
}

fun findDivisor(num: Int): MutableList<Int> {
    val result = mutableListOf<Int>()
    for (i in 1 .. sqrt(num.toDouble()).toInt()){
        if (num % i == 0){
            result.add(i)
            if (num / i != i){
                result.add(num / i)
            }
        }
    }
    result.sort()
    return result
}