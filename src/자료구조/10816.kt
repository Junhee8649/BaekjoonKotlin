package 자료구조

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    // n 사용: 상근이가 가진 카드 개수 확인용
    val n = br.readLine().toInt()
    val cardCounts = hashMapOf<Int, Int>()

    // 상근이의 카드 입력 (n개 확인)
    val cards = br.readLine().split(" ").map { it.toInt() }
    for (i in 0 until n) {
        val card = cards[i]
        cardCounts[card] = cardCounts.getOrDefault(card, 0) + 1
    }

    // m 사용: 찾아야 할 카드 개수 확인용
    val m = br.readLine().toInt()
    val queries = br.readLine().split(" ").map { it.toInt() }

    // m개의 쿼리 처리
    for (i in 0 until m) {
        val query = queries[i]
        bw.write("${cardCounts.getOrDefault(query, 0)} ")
    }

    bw.flush()
    bw.close()
    br.close()
}