package 구현

import java.util.Collections.sort

fun main(){
    val n = readln().toInt()
    val arr : List<Int> = readln().split(" ").map { it.toInt() }

    sort(arr)
    print(arr.last())
}