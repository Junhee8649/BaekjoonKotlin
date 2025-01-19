package 수학

fun main(){
    val (w, h) = readln().split(" ").map { it.toFloat() }

    print(String.format("%.1f", w * h / 2))
}