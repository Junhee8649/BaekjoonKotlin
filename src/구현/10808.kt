package 구현

fun main() {
    val alpha = hashMapOf<Char, Int>()
    for (i in 'a'..'z'){
        alpha[i] = 0
    }
    val word = readln()
    for (char in word) {
        if (alpha.containsKey(char)) alpha[char] = alpha[char]!! + 1
    }
    println(alpha.values.joinToString(" "))
}