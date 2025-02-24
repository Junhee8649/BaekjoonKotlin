package 구현

fun main() {
    val jaehwan = readln()
    val doctor = readln()

    if (jaehwan.count { it == 'a' } >= doctor.count { it == 'a' }) print("go") else print("no")
}