package 수학

import kotlin.math.sqrt

fun main(){
    val t = readln().toInt()
    val allNumber = readln().split(" ").map { it.toInt() }
    repeat(t){
        val divisor = findDivisorSum(allNumber[it])
        when{
            divisor < allNumber[it] -> println("Deficient")
            divisor > allNumber[it] -> println("Abundant")
            divisor == allNumber[it] -> println("Perfect")
        }
    }
}

fun findDivisorSum(num: Int): Int {
    val sqrt = sqrt(num.toDouble())
    val result = mutableListOf<Int>()
    var sum = 0

    for (i in 1 .. sqrt.toInt()){
        if (num % i == 0){
            result.add(i)
            if (num / i != i){
                result.add(num / i)
            }
        }
    }

    for (i in result) {
        sum += i
    }

    return sum - num
}