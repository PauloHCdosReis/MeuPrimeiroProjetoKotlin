package aula_33_typealiases

typealias Operation = (Int, Int) -> Int

fun mathOperation(a: Int, b: Int, operation: Operation): Int {
    return operation(a, b)
}

typealias NomeDoEstudante = String

typealias NotasDoEstudante = List<Int>

typealias MapaDeEstudantes = Map<NomeDoEstudante, NotasDoEstudante>

fun processaNotas(mapaEstudantes: MapaDeEstudantes){
    for((nome, notas) in mapaEstudantes){
        println("Estudante: $nome | Notas: ${notas.joinToString()}")
    }
}

fun main(){

    val estudantes: MapaDeEstudantes = mapOf(
        "João" to listOf(10, 9, 8, 7),
        "Maria" to listOf(10, 9, 8, 7),
        "Pedro" to listOf(10, 9, 8, 7),
        "Ana" to listOf(10, 9, 8, 7),
    )

    processaNotas(estudantes)

}