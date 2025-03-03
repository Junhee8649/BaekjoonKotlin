package 수학

// 완전제곱식 응용
fun main() {
    val n = readln().toInt()
    val numbers = readln().split(" ").map { it.toInt() }

    var totalSum = 0L
    var sumOfSquares = 0L

    for (i in 0 until n) {
        totalSum += numbers[i]
        sumOfSquares += numbers[i].toLong() * numbers[i]
    }

    val result = (totalSum * totalSum - sumOfSquares) / 2
    println(result)
}