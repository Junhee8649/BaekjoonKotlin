package 다이나믹프로그래밍

fun main() {
    val x = readln().toInt()
    val dp = IntArray(x + 1) {0}

    dp[1] = 0

    for (i in 2 .. x){
        dp[i] = dp[i - 1] + 1

        if (i % 2 == 0)
            dp[i] = minOf(dp[i], dp[i / 2] + 1)

        if (i % 3 == 0)
            dp[i] = minOf(dp[i], dp[i / 3] + 1)
    }
    print(dp[x])
}
