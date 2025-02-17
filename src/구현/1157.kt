package 구현

fun main(){
    val word = readln().uppercase()
    val wordMap = mutableMapOf<Char, Int>()

    repeat(word.length){
        wordMap[word[it]] = wordMap.getOrDefault(word[it], 0) + 1
    }
    // max 변수는 단순히 빈도수 그 자체가 아니라, 빈도수가 최대인 Map 엔트리
    val max = wordMap.maxBy { it.value }
    if(wordMap.filter{it.value == max.value}.size > 1) println("?") else println(max.key)
}