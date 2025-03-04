package 수학

fun main(){
    var price = readln().toInt()
    val count = readln().toInt()
    repeat(count){
        val (a, b) = readln().split(" ").map { it.toInt() }
        price -= a * b
    }
    if (price == 0) print("Yes") else print("No")
}