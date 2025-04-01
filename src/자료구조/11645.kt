package 자료구조

fun main(){
    val t = readln().toInt()
    repeat(t){
        val n = readln().toInt()
        val contain = hashSetOf<String>()
        repeat(n){
            val city = readln()
            contain.add(city)
        }
        println(contain.size)
    }
}