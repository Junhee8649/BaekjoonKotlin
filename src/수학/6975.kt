package 수학

import kotlin.math.sqrt

fun main(){
    val n = readln().toInt()
    repeat(n){
        var sum = 0
        val number = readln().toInt()
        for (i in 0..<divisor(number).size-1){
            sum += divisor(number)[i]
        }
        when{
            sum < number -> println("$number is a deficient number.\n")
            sum == number -> println("$number is a perfect number.\n")
            else -> println("$number is an abundant number.\n")
        }
    }
}

fun divisor(num: Int): MutableList<Int> {
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