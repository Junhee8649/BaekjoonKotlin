package 구현

fun main(){
    val word = readln()
    when(word){
        "M" -> println("MatKor")
        "W" -> println("WiCys")
        "C" -> println("CyKor")
        "A" -> println("AlKor")
        "$" -> println("\$clear")
    }
}