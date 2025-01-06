package desafios

fun main() {

    println("Insira o preço da gasolina:")
    print("R$ ")
    val precoGasolina = readlnOrNull()?.toDoubleOrNull()

    println("Insira o preço do etanol:")
    print("R$ ")
    val precoEtanol = readlnOrNull()?.toDoubleOrNull()

    if (precoGasolina == null || precoEtanol == null) {
        println("Valores inválidos.")
        return
    }

    val resultado = precoEtanol / precoGasolina

    when {
        resultado < 0.7 -> println("Compensa abastecer com etanol.")
        resultado > 0.7 -> println("Compensa abastecer com gasolina.")
        else -> println("Tanto faz.")
    }
}