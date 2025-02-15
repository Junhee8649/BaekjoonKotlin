package 구현

fun main() {
    val n = 15
    val matrix = mutableListOf<String>()
    repeat(n) {
        matrix.addAll(readln().split(" "))
    }
    when {
        matrix.contains("w") -> println("chunbae")
        matrix.contains("b") -> println("nabi")
        matrix.contains("g") -> println("yeongcheol")
    }
}

