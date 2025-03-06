package 수학

import java.math.BigDecimal
import java.math.MathContext
import java.math.RoundingMode

fun main() {
    val (a, b) = readln().split(" ").map { BigDecimal(it) }
    // 소수점 2,000자리 이상 출력하면 출력 초과가 발생할 수 있어 2000으로 제한
    val precision = 2000
    val result = a.divide(b, MathContext(precision, RoundingMode.HALF_UP))
    //  BigDecimal 객체를 일반 십진수 표기법의 문자열로 변환하는 메소드는 toPlainString()
    println(result.toPlainString())
}