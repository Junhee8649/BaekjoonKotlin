package 구현

fun main(){
    val t = readln().toInt()
    repeat(t){
        var n = readln().toInt()
        var max = n
        while (n != 1){
            when{
                n % 2 == 0 -> n /= 2
                n % 2 != 0 -> n = n * 3 + 1
            }
            if (max < n) max = n
        }
        println(max)
    }
}