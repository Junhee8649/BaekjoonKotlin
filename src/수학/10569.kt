package 수학

fun main(){
    val t = readln().toInt()
    repeat(t){
        val (v, e) = readln().split(" ").map { it.toInt() }
        println(e-v+2)
    }
}