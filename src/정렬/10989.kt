package 정렬

fun main() {
    // 버퍼를 사용하여 시간 단축을 요구한 문제
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val count = br.readLine().toInt()
    val arr = IntArray(count)
    for (i in 0 until count) {
        arr[i] = br.readLine().toInt()
    }

    arr.sort()

    arr.forEach { bw.write("$it\n") }
    bw.flush()
}
