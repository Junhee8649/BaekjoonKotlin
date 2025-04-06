package 수학

fun main(){
    while (true){
        val n = readln().toInt()
        if (n == 0) return
        val sum = (1..n).sum()
        println(sum)
    }
}