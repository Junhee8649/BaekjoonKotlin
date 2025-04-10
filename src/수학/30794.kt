package 수학

fun main(){
    val (level, judge) = readln().split(" ")
    var score = 0

    when(judge){
        "miss" -> score = 0
        "bad" -> score = 200
        "cool" -> score = 400
        "great" -> score = 600
        "perfect" -> score = 1000
    }

    println(level.toInt() * score)
}