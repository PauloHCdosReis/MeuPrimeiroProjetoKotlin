package aula_16_classes

import kotlin.random.Random

class Person(val name: String = "Desconhecido", lastName:String, val age: Int = 0) {

    val fullName: String = "$name $lastName"

    private val password: String = name + Random.nextInt(100)

    private fun usePassword() {
        println(password)
    }

    fun work() {
        usePassword()
        println("$name, $age trabalhando...")
    }
}

fun main() {

    val jose: Person = Person(name = "José", lastName = "Silva", age = 20)
    val maria: Person = Person(name = "Maria", lastName = "Rodrigues")

    jose.work()
    maria.work()

    println(jose.fullName)
    println(maria.fullName)
}