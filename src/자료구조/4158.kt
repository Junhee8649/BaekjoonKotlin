package 자료구조

fun main() {
    while (true) {
        val (n, m) = readln().split(" ").map { it.toInt() }

        if (n == 0 && m == 0) break

        val sanggeun = hashSetOf<Int>()
        repeat(n) {
            sanggeun.add(readln().toInt())
        }

        var count = 0
        repeat(m) {
            val cd = readln().toInt()
            if (cd in sanggeun) {
                count++
            }
        }

        println(count)
    }
}