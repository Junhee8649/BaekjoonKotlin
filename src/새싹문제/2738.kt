package 새싹문제

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val matrixA = Array(n) { readln().split(" ").map { it.toInt() } }
    val matrixB = Array(n) { readln().split(" ").map { it.toInt() } }

    for (i in 0..<n) {
        for (j in 0..<m) print("${matrixA[i][j] + matrixB[i][j]} ")
        if(i != n-1) println()
    }
}