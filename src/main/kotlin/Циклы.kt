fun whileOne() {
    var i = 20
    while (i >= 10) {
        print("$i ")
        i--
    }
} // Base

fun whileTwo() {
    while (true) {
        print("Введите пароль: ")
        val pass = readln()
        when (pass) {
            "qwerty" -> break
            else -> println("Попробуй ещё раз ...")
        }
    }
} // while true

fun whilTree() {
    var i = 1
    do {
        println(i)
        i++
    }while (i <= 10 )
} // while do

fun forOne() {
    val lst = listOf("Tom", "Sam", "Kate")
//    for (i in lst.indices) {
//        println("Индекс: $i, Значение: ${lst[i]}")
//    }

//    for (i in lst) {
//        println(i)
//    }
//}

    for ((i, v) in lst.withIndex()) {
        println("Индекс: $i, Значение: $v")
    }
} // enumerate in Python



fun forTwo() {
    (1..10).forEach{ print("$it ") }
}
// forEach


fun main() {
    forOne()
}


