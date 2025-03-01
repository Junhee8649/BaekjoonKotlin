package 수학

fun main(){
    val n = readln().toInt()
    var first = readln().toInt()
    var count = 0
    if (n == 1)
        println(0)
    else{
        repeat(n-1){
            val next = readln().toInt()
            if (next > first) count += next - first else first = next
        }
    }
    print(count)
}