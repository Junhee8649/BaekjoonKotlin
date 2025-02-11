package 구현

fun main(){
    while(true){
        val num = readln().toInt()
        if(num == 0) break
        for(i in 1 .. num){
            repeat(i) { print("*") }
            println()
        }
    }
}