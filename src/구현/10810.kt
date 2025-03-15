package 구현

fun main(){
    val (n, m) = readln().split(" ").map { it.toInt() }
    val basket = MutableList(n){0}
    repeat(m){
        val (i, j, k) = readln().split(" ").map { it.toInt() }
        for (num in i-1 .. j-1){
            basket[num] = k
        }
    }
    println(basket.joinToString(" "))
}