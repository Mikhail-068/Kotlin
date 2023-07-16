fun typeByte() {
    val a: Byte = 10
    val b = 20
    val c = (a + b).toByte()
    print(c)
}

fun typeAny() {
    val a: Any = 1
    val b = 2
    val c = (a as Int) + b
    print(c)
}

fun typeString() {
    val a = "Погода "
    val str_ = "кофе, чай, батон"
    val lst = str_.split(", ")
    println("$a -> ${a.reversed()}")
    println(a.length) // Len
    println(a + "Солнечная") // Concat
    println(a.repeat(5)) // repeat
    println(a.contains("года")) // f
    println(lst) // split
    var str_2 = lst.joinToString(
        separator = ", ", // разделитель
        prefix = "«", // начало строки
        postfix = "»", // конец строки
        limit = 2, // кол-во слов
        truncated = "..." // последний элемент
    )
    println(str_2.replace(", ...", "..."))
}

fun main() {
    typeString()
}