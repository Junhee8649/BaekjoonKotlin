package 수학

fun main(){
    var t = readln().toInt()
    var count = 0
    while (t / 10 != 0){
        var num = 1
        for (i in t.toString()){
            num *= i.digitToInt()
        }
        t = num
        count++
    }
    println(count)
}