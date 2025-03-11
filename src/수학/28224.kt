package 수학

fun main(){
    val day = readln().toInt()
    var priceSum = 0
    repeat(day){
        val price = readln().toInt()
        priceSum += price
    }
    print(priceSum)
}