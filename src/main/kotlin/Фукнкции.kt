fun squre(x: Int): Int = x * x // Однострочная

//Перегрузка функций означает, что вы можете объявить несколько
// функций с одним и тем же именем, но с разными параметрами.
fun mean(lst: List<Int>): Int {
    return lst.sum() / lst.size
}
fun mean(lst: List<Double>): Double {
    return lst.sum() / lst.size
}

//fun main() { // Анонимная функция (функция без имени)
//    val result = fun(x: Int): Int = x * 2
//    print(result(5))
//}

fun main() {
//    val res = { x: Int, y: Int -> x + y} // Lambda v.1
//    println(res(5,4))

    val res = {x: Int, y: Int ->
        val s = x + y
        val d = x - y
        println("Сумма: $s, Разница: $d")
    } // Lambda v.2
    res(5,4)
}
