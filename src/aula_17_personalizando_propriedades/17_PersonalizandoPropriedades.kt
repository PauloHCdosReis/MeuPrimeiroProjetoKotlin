package aula_17_personalizando_propriedades


class Person(
    val name: String,
) {
    var age: Int = 0
        set(value) {
            if (value >= 0) field = value
            else println("Idade não pode ser negativa")
        }

    var height: Double = 0.0
        get() = Math.ceil(field)

}

fun main() {

    val joao = Person(name = "João")

    joao.age = 30
    joao.height = 175.2

    println(joao.age)
    println(joao.height)

    joao.age = -10

    println(joao.age)
}