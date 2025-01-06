package aula_34_validacoes_de_argumentos

// require: Verifica se a condição é verdadeira, caso contrário, lança uma exceção IllegalArgumentException

fun dividir(a: Int, b: Int): Int {
    require(b != 0) { "O divisor não pode ser zero." } // IllegalArgumentException
    return a / b
}

// requireNotNull: Verifica se o valor é diferente de null, caso contrário, lança uma exceção IllegalArgumentException

fun imprimirNome(nome: String?) {
    val nomeNaoNulo = requireNotNull(nome) { "O nome não pode ser nulo." } // IllegalArgumentException
    println(nomeNaoNulo)
}

// check: Verifica se a condição é verdadeira, caso contrário, lança uma exceção IllegalArgumentException

fun processarLista(lista: List<Int>) {
    check(lista.isNotEmpty()) { "A lista não pode ser vazia." } // IllegalStateException
    println("Processando lista de tamanho ${lista.size}")
    check(lista.all { it != 0 }) { "O aluno foi reprovado devido a possuir uma nota 0." } // IllegalStateException
    println("A média é ${lista.sum() / lista.size}.")
}

fun main() {

    // imprimirNome("Paulo")
    // imprimirNome(null) // IllegalArgumentException

    // println(dividir(10, 2)) // 5
    // println(dividir(10, 0)) // IllegalArgumentException

    processarLista(listOf(1, 2, 0, 2))
}