package 구현

fun main() {
    val char = readln().trim().first()

    // '가'의 유니코드 값 (0xAC00)
    val baseCode = '가'.code

    // 입력된 문자의 유니코드 값에서 '가'의 유니코드 값을 빼고 1을 더해 순서 계산
    val order = char.code - baseCode + 1

    println(order)
}