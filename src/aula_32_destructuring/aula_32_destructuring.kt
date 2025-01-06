package aula_32_destructuring

data class Person(val name: String, val lastName: String, val age: Int)

class Animal(val name: String, val age: Int) {
    operator fun component1() = name
}

fun main() {

    val ( pauloName, pauloLastName, pauloAge ) = Person(name = "Lucas", lastName = "Fonseca", age = 25)

    val ( a, b ) = Pair<String, String>("a", "b")

    val (c, d, e) = Triple<Int, Boolean, Double>(10, true, 10.0)

    pauloName
    pauloLastName
    pauloAge

    a
    b
    c
    d
    e

    val (animalName) = Animal(name = "Cachorro", age = 3)

    animalName
}