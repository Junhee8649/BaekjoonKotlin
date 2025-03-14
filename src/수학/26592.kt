package 수학

fun main(){
    val n = readln().toInt()
    repeat(n){
        val (a, b) = readln().split(" ").map { it.toDouble() }
        val answer = 2 * a / b
        println(String.format("The height of the triangle is %.2f units", answer))
    }
}