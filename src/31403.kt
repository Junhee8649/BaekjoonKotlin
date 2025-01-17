fun main(){
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    println(a+b-c)
    print(addSub(a,b,c))
}

fun addSub(a: Int, b: Int, c: Int) : Int{
    return (a.toString().plus(b.toString())).toInt() - c
}