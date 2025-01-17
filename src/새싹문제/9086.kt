package 새싹문제

fun main(){
    val testNumber = readln().toInt()
    for (i in 0..<testNumber){
        val testString = readln()
        if (i != testNumber-1) println("${testString.first()}${testString.last()}") else print("${testString.first()}${testString.last()}")
    }
}