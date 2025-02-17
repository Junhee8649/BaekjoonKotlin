package 수학

fun main(){
    val testCases = readln().toInt()
    for (i in 1..testCases){
        val (a,b) = readln().split(" ").map { it.toInt() }
        print("Case $i: ")
        if (a == 0) println(0)
        else if (a % b == 0) println(a / b)
        else if (a < b) println("$a/$b")
        else println("${a / b} ${a % b}/$b")
    }
}