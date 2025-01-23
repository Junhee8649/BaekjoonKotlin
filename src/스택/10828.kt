package 스택

fun main(){
    val n = readln().toInt()
    val stack = ArrayDeque<Int>()

    repeat(n) {
        val input  = readln().split(" ")
        when(input.first()){
            "top" ->  if (stack.isEmpty()) println(-1) else println(stack.last())
            "empty" -> if (stack.isEmpty()) println(1) else println(0)
            "size" -> println(stack.size)
            "pop" -> if (stack.isEmpty()) println(-1) else println(stack.removeLast())
            "push" -> stack.addLast(input.last().toInt())
        }
    }
}


