fun dicOne() {
    val dic = mapOf("Tom" to 20, "Sam" to 18)
    println(dic)
    println(dic.keys) // Ключи
    println(dic.values) // Значения
    println(dic.entries) // Ключ-Значение
    println(dic.size) // Длина
} // base

fun dicTwo() {
    val dic = mutableMapOf("Tom" to 20, "Sam" to 18)
    println("Оригинал: $dic")
    dic["Tom"] = 25 // изменяем значение
    println("Изменённые значение: $dic")
    dic.remove("Sam") // del value
    println("Удаление по ключу Sam: $dic")
    dic["Kate"] = 20 // add value
    println("Добавляем значение: $dic")
}

fun main() {
    dicTwo()
}