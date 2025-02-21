package 수학

fun main(){
    val n = readln().toInt()
    if (n == 0) println("divide by zero")
    else {
        val list = readln().split(" ").map { it.toInt() }
        val average = list.average().toDouble()
        var e: Double = 0.0
        list.forEach { e += it }
        e /= n
        println("%.2f".format(average / e))
    }
}