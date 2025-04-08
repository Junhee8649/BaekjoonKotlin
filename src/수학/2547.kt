package 수학

import java.math.BigInteger

fun main(){
    val t = readln().toInt()
    repeat(t){
        readln()
        val n = readln().toInt()
        var sum = BigInteger("0")
        for (i in 1 .. n){
            val candy = readln().toBigInteger()
            sum += candy
        }
        println(if ((sum % n.toBigInteger()).toInt() == 0) "YES" else "NO")
    }
}