fun conditionIfElse() {
    val a = 10

    if (a < 10) {
        println("Меньше")
    }
    else if (a ==  10) {
        println("Равно")
    }
    else {
        print("Больше")
    }
}

//val conditionWhen() {
//    val a = 5
//
//    when (a) {
//        1 -> print("x == 1")
//        2 -> print("x == 2")
//        else -> print("x is neither 1 nor 2")
//    }
//}

//fun conditionWhen() {
//    val a = 5
//    val result = when {
//        a == 10 -> "Равно"
//        a > 10 -> "Больше"
//        a < 10 -> "Меньше"
//        else -> "Неизвестное значение"
//    }
//    print(result)
//}



fun conditionWhen1() {
    val a = 5
    print(when {
        a == 9 -> "девять"
        a == 8 -> "восемь"
        a == 7 -> "семь"
        a == 6 -> "шесть"
        a == 5 -> "пять"
        else -> "Что то другое"
    })
}

fun conditionWhen2():String { // При использование return указываем, какой тип данных возвращает функция
    val a = 5

    return when {
        a == 9 -> "девять"
        a == 8 -> "восемь"
        a == 7 -> "семь"
        a == 6 -> "шесть"
        a == 5 -> "пять"
        else -> "Что то другое"
    }
}


fun variableNull() {
    val a: Int? = null

    val b = if (a != null) {
        a * 2 // Если a != null, b == a*2
    } else {
        -1 // Если a == null, b == -1
    }
    print(b)

}


fun main() {
    variableNull()
}