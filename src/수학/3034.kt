package 수학

fun main(){
    val(n, w, h) = readln().split(" ").map { it.toInt() }
    repeat(n){
        val match = readln().toInt()
        if (match*match > w*w+h*h) println("NE") else println("DA")
    }
}