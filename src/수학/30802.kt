package 수학

fun main(){
    val n = readln().toInt()
    val list = readln().split(" ").map { it.toInt() }
    val (t, p) = readln().split(" ").map { it.toInt() }

    var minT = 0
    val maxP = n / p
    val oneP = n % p

    list.forEach {
        val temp = if (it == 0) 0 else ((it - 1) / t) + 1
        minT += temp
    }

    println(minT)
    print("$maxP $oneP")
}

private operator fun <E> List<E>.component6() = this[5]