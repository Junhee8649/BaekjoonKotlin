package 수학

fun main(){
    val (a, b, c) = readln().split(" ").map { it.toDouble() }
    val firstNum = ((a * b) / c).toInt()
    val lastNum = ((a / b) * c).toInt()
    print(maxOf(firstNum, lastNum))
}