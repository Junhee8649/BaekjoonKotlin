package 구현

fun main(){
    val t = readln().toInt()
    repeat(t){
        var (error, word) = readln().split(" ")
        word = word.removeRange(error.toInt()-1, error.toInt())
        println(word)
    }
}