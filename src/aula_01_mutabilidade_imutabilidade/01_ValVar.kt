package aula_01_mutabilidade_imutabilidade

fun main() {

    val name = "Paulo Reis"

    var age = 21

    age = 22

    try {
        val resultado = 10 / 0
        println(resultado)
    } catch (e: Exception) {
        println("Erro: divisão por zero")
    }
}