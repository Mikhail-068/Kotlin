fun variable_1() {
    var a = "Kotlin"
    a = "Python"
//    print("Hello " + a)
    print("Hello $a")
}

fun variable_2() {
    print("Ввод: ")
    val a = readln().toInt()
    val b = 5
    print("$a + $b = ${a + b}")

}

fun variable_null() {
    var a: Int? = 12
    a = null
    print(a)
}

fun main() {
    variable_null()
}
