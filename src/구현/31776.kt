package 구현

fun main() {
    val n = readln().toInt()
    var goodTeam = 0

    repeat(n) {
        val times = readln().split(" ").map { it.toInt() }
        val t1 = times[0]
        val t2 = times[1]
        val t3 = times[2]

        // 성실한 팀인지 한 번에 체크
        val isGoodTeam = when {
            // 최소 하나의 문제를 해결했는지
            t1 == -1 && t2 == -1 && t3 == -1 -> false
            // 순서대로 해결했는지
            t1 == -1 && (t2 != -1 || t3 != -1) -> false
            t2 == -1 && t3 != -1 -> false
            // 시간 순서가 맞는지
            t1 != -1 && t2 != -1 && t1 > t2 -> false
            t2 != -1 && t3 != -1 && t2 > t3 -> false
            // 모든 조건 통과
            else -> true
        }

        if (isGoodTeam) goodTeam++
    }

    println(goodTeam)
}