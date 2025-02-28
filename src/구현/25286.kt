package 구현

fun main(){
    val t = readln().toInt()
    val thirtyOne = listOf(1,3,5,7,8,10,12)
    val thirty = listOf(4,6,9,11)
    repeat(t){
        var (year, month) = readln().split(" ").map { it.toInt() }
        if (month == 1){
            month = 12
            year -= 1
        }
        else
            month -= 1

        if (month in thirtyOne)
            println("$year $month 31")
        else if (month in thirty)
            println("$year $month 30")
        else{
            if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0)
                println("$year $month 29")
            else
                println("$year $month 28")
        }
    }
}