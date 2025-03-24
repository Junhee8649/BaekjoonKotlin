package 수학

fun main(){
    val t = readln().toInt()
    repeat(t){
        val n = readln().toInt()
        var sum = 0
        val numbers = readln().split(" ").map { it.toInt() }

        for (i in 0 until n){
            sum += numbers[i]
        }
        println(sum)
    }
}