package 구현

fun main(){
    val (n, k) = readln().split(" ").map { it.toInt() }
    val numbers = readln().split(" ").map { it.toInt() }.toMutableList()
    var count = 0

    for (i in n-1 downTo 1){
        var maxIndex = 0
        for (j in 1 .. i){
            if (numbers[j] > numbers[maxIndex])
                maxIndex = j
        }

        if (maxIndex != i){
            count++
            if (count == k){
                println("${minOf(numbers[maxIndex], numbers[i])} ${maxOf(numbers[maxIndex], numbers[i])}")
                return
            }

            val temp = numbers[maxIndex]
            numbers[maxIndex] = numbers[i]
            numbers[i] = temp
        }
    }
    if (k > count) println(-1)
}