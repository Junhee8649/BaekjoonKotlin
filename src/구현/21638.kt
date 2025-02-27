package 구현

fun main(){
    val (t, v) = readln().split(" ").map { it.toInt() }
    val (T, V) = readln().split(" ").map { it.toInt() }

    when{
        T < 0 && V >= 10 -> println("A storm warning for tomorrow! Be careful and stay home if possible!")
        T < t -> println("MCHS warns! Low temperature is expected tomorrow.")
        V > v -> println("MCHS warns! Strong wind is expected tomorrow.")
        else -> println("No message")
    }
}