package 수학

fun main(){
    var n = readln().toInt()
    while (n != 0){
        println(plusPow(n))
        n = readln().toInt()
    }
}

fun plusPow(n: Int): Int{
    var sum = 0
    for (i in 1 .. n){
        sum += i * i
    }
    return sum
}