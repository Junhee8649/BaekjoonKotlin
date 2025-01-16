fun main() {
    val word = readlnOrNull()
    val result = word?.map {
        if (it.isUpperCase()) it.lowercaseChar() else it.uppercaseChar()
    }?.joinToString("")
    print(result)
}