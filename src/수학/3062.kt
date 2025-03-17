package 수학

fun main(){
    val t = readln().toInt()
    repeat(t){
        val number = readln()
        palindromic(switchNumber(number))
    }

}

fun switchNumber(num: String): String{
    var switch = ""
    for (i in num.reversed()){
        switch += i
    }
    val sum = (switch.toInt() + num.toInt()).toString()
    return sum
}

fun palindromic(sum: String){
    val sumSize = sum.length
    var symmetry = true
    for (i in 0 .. sumSize / 2){
        if (sum[i] != sum[sumSize-i-1]) symmetry = false
    }
    when(symmetry){
        true -> println("YES")
        false -> println("NO")
    }
}