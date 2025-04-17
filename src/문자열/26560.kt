package 문자열

fun main(){
    val count = readln().toInt()

    repeat(count) {
        val sentence = readln()
        sentence.trimEnd()
        if (sentence.last() == '.') println(sentence) else println("${sentence}.")
    }
}