package 구현

fun main() {
    val n = readln().toInt()
    val mirror = List(n) { readln() }
    val k = readln().toInt()

    when (k) {
        1 -> mirror.forEach { println(it) }
        2 -> mirror.forEach { println(it.reversed()) }
        3 -> mirror.reversed().forEach { println(it) }
    }
}
