package aula_11_funcoes

fun isEven(num: Int) {
    println("$num é par? ${if (num % 2 == 0) "Sim" else "Não" }")
}

fun main () {

    val num = 2

    isEven(num = num)
}