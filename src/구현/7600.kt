package 구현

fun main(){
    var sentence = ""
    while (sentence != "#"){
        var count = 0
        val filter = hashSetOf<Char>()
        sentence = readln().lowercase()
        sentence.forEach {
            filter.add(it)
        }
        filter.forEach {
            if (it.isLetter()) count++
        }
        if (sentence != "#") (println(count))
    }
}