package 수학

fun main() {
    val n = readln().toInt() // 사용되지 않지만 입력은 받음
    val binaryString = readln()
    val k = readln().toInt()

    // 특수 케이스: k가 0이면 모든 수는 2^0=1로 나누어 떨어짐
    if (k == 0) {
        println("YES")
        return
    }

    // 이진 문자열에서 끝에서부터 연속된 0의 개수 세기
    var trailingZeros = 0
    for (i in binaryString.length - 1 downTo 0) {
        if (binaryString[i] == '0') {
            trailingZeros++
        } else {
            break
        }
    }

    println(if (trailingZeros >= k) "YES" else "NO")
}