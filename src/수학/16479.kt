package 수학

fun main(){
    val k = readln().toInt()
    val (dUp, dDown) = readln().split(" ").map { it.toInt() }
    val triangleBase = (dUp - dDown) / 2.0

    println(k*k - triangleBase*triangleBase)
}