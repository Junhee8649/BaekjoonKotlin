package 수학

fun main(){
    val (a, b) = readln().split(" ").map { it.toInt() }
    val (c, d) = readln().split(" ").map { it.toInt() }
    val sum = a + b + c + d
    // (sum - 2)를 4로 나눈 나머지가 음수가 나오지 않도록 보정하고, 1부터 4까지의 값을 만들기 위해 +1
    val result = ((sum - 2) % 4 + 4) % 4 + 1
    println(result)
}