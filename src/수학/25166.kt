package 수학

fun main() {
    val ari = 1023
    val (sandwich, coogie) = readln().split(" ").map { it.toInt() }

    when {
        sandwich <= ari -> println("No thanks")
        // (sandwich - ari) and coogie == sandwich - ari: 비트마스킹의 핵심 부분
        sandwich - ari <= coogie && (sandwich - ari) and coogie == sandwich - ari -> println("Thanks")
        else -> println("Impossible")
    }
}