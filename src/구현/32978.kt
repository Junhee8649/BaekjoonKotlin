package 구현

fun main(){
    val n = readln().toInt()
    val food = readln().split(" ")
    val choi = readln().split(" ")

    for (i in food){
        if(i !in choi) println(i)
    }
}