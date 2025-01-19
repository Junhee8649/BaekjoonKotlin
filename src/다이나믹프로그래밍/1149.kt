package 다이나믹프로그래밍

fun main(){
    val n = readln().toInt()
    val dp = Array(n + 1){IntArray(3){0} }

    val (r, g, b) = readln().split(" ").map { it.toInt() }
    dp[1][0] = r
    dp[1][1] = g
    dp[1][2] = b

    for (i in 2 .. n){
        val (costR, costG, costB) = readln().split(" ").map { it.toInt() }
        dp[i][0] = costR + minOf(dp[i - 1][1], dp[i - 1][2])
        dp[i][1] = costG + minOf(dp[i - 1][0], dp[i - 1][2])
        dp[i][2] = costB + minOf(dp[i - 1][0], dp[i - 1][1])
    }

    println(minOf(dp[n][0], dp[n][1], dp[n][2]))
}