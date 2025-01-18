package 다이나믹프로그래밍

fun main() {
    val t = readln().toInt()
    for (i in 0 until t) {
        val n = readln().toInt()
        val dp = IntArray(n + 1) { 0 }
        dp[0] = 1  // 아무 수도 사용하지 않는 경우를 1로 초기화 (기저 사례)

        // 1부터 n까지 각 숫자에 대해 경우의 수를 누적 계산합니다.
        for (i in 1..n) {
            if (i - 1 >= 0) dp[i] += dp[i - 1]
            if (i - 2 >= 0) dp[i] += dp[i - 2]
            if (i - 3 >= 0) dp[i] += dp[i - 3]
        }

        println(dp[n])
    }
}
