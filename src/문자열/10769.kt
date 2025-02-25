package 문자열

fun main(){
    val chat = readln()
    var happy = chat.indexOf(":-)")
    var sad = chat.indexOf(":-(")
    var happyCount = 0
    var sadCount = 0

    while (happy != -1) {
        happyCount += 1
        happy = chat.indexOf(":-)", happy + 1)
    }
    while (sad != -1) {
        sadCount += 1
        sad = chat.indexOf(":-(", sad + 1)
    }

    when{
        sadCount > happyCount -> println("sad")
        happyCount > sadCount -> println("happy")
        happyCount == 0 && sadCount == 0 -> println("none")
        happyCount == sadCount -> println("unsure")
    }
}