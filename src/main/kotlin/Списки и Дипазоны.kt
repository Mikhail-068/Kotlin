fun listRange() {
    val a = (1..100 step 17).toList() // Диапазон включительно
    val b = (1 until 10).toList() // Диапазон не включительно
    val c = (10 downTo 1).toList() // Обратный отcчет

    println(a)
    println(b)
    println(c)
} // Range

fun listOne() {
    val lst: List<Any> = listOf(1, 2.3, "Text")
    println(lst)
} // List<Any>

fun listAdd() {
    val lst_1 = mutableListOf("Метель", "Снег")
    val lst_2 = mutableListOf("Дождь", "Ливень")
    lst_1.add(lst_2[0]) // добавляем один элемент
    lst_2.addAll(0, lst_1) // добавляем все элементы
//    val b = listOf("Дождь", "Ливень", "Град")

    println(lst_2)
    println(lst_2.size)
} // Add


fun listRemove() {
    val lst_1 = mutableListOf("Метель", "Снег", "Дождь", "Ливень")
    lst_1.remove("Метель") // удаляем один элемент
    lst_1.removeAt(1) // удаляем по индексу
    println(lst_1)
}


    fun listRange2() {
        var lst = (1..10).toMutableList() // диапазон в список
        println("Оригинал: $lst") // оригинал
        lst.shuffle()
        println("Перемешанный: $lst") // перемешать
        lst.sort()
        println("Сортированный: $lst") // сортированный
    } // Диапазоны

    fun listSlace() {
        val lst = listOf("Tom", "Sam", "Kate", "Bob", "Alice")
        println("Оригинал: $lst")
        println("c 3-6 index: ${lst.subList(1, 3)}")
        println("Last: ${lst.last()}")
        println(lst.slice(1..3)) // включительно
        println(lst.slice(0 until 5 step 2)) // не включительно
        println(lst.slice(4 downTo 0 step 2))
        println(lst.slice(1..4).reversed())
        println(lst.subList(lst.size - 2, lst.size)) // c предпоследнего до конца
    } // Slice


//fun main() {
//    val lst = mutableListOf<Any>(12, 23, listOf(1, 2, 3, 4, 5, 3, 2, 1, 4), listOf(1, 2, 3.14, "Hello", true, 43, false, "bla bla"))
//    print(lst)
//}



fun main() {
    listAdd()
}