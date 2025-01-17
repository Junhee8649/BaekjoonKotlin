fun main(){
    val (a, b) = readln().split(" ").map { it.toLong() }
    val magic : (Long, Long) -> Long = {x, y -> (x+y) * (x-y)}
    print(magic(a,b))
}