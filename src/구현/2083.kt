package 구현

fun main(){
    while (true){
        val member = readln().split(" ")
        if (member == listOf("#", "0", "0")) break
        when{
            member[1].toInt() > 17 -> println("${member[0]} Senior")
            member[2].toInt() >= 80 -> println("${member[0]} Senior")
            else -> println("${member[0]} Junior")
        }
    }
}