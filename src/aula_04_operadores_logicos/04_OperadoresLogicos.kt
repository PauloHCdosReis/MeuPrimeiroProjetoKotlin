package aula_04_operadores_logicos

fun main() {

    val a = true
    val b = false
    val c = true

    // operador E (&&)

    val result = a && b
    val result2 = a && c

    println("operador E (&&)")
    println(result)
    println(result2)

    // operador OU (||)

    val result3 = a || b
    val result4 = a || c

    println("operador OU (||)")
    println(result3)
    println(result4)

    // operador NÃO (!)

    val e = true
    val f = !e

    println("operador NÃO (!)")
    println(f)

    val num1 = 10
    val num2 = 5

    // operador IGUALDADE (==)

    println("operador IGUALDADE (==)")
    println(num1 == num2)

    // operador DESIGUALDADE, DIFERENTE DE (!=)

    println("operador DESIGUALDADE, DIFERENTE DE (!=)")
    println(num2 != num1)

    // operadores É DO TIPO e NÃO É DO TIPO (is e !is)

    val num: Any = 1
    val numText: Any = "1"

    println("operadores É DO TIPO (is)")
    println(num is String)
    println(numText is String)

    println("operadores NÃO É DO TIPO (!is)")
    println(num !is String)
    println(numText !is String)

    // operadores PERTENCE  e NÃO PERTENCE (in e !in)

    val range = 1..10
    val x = 5
    val y = 15

    println("Operadores PERTENCE:")
    println(x in range)
    println(y in range)

    println("Operadores NÃO PERTENCE:")
    println(x !in range)
    println(y !in range)
}
