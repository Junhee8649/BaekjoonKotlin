package 수학

fun main() {
    val a = readln()
    val b = readln()
    val c = readln()
    if (a != "Fizz" && a != "Buzz" && a != "FizzBuzz"){
        val answer = a.toInt() + 3
        when{
            answer % 3 == 0 && answer % 5 == 0 -> print("FizzBuzz")
            answer % 3 == 0 -> print("Fizz")
            answer % 5 == 0 -> print("Buzz")
            else -> print(answer)
        }
    }
    else if (b != "Fizz" && b != "Buzz" && b != "FizzBuzz"){
        val answer = b.toInt() + 2
        when{
            answer % 3 == 0 && answer % 5 == 0 -> print("FizzBuzz")
            answer % 3 == 0 -> print("Fizz")
            answer % 5 == 0 -> print("Buzz")
            else -> print(answer)
        }
    }
    else if (c != "Fizz" && c != "Buzz" && c != "FizzBuzz"){
        val answer = c.toInt() + 1
        when{
            answer % 3 == 0 && answer % 5 == 0 -> print("FizzBuzz")
            answer % 3 == 0 -> print("Fizz")
            answer % 5 == 0 -> print("Buzz")
            else -> print(answer)
        }
    }
}