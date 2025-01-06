package aula_19_classe_aberta

open class Animal(val name: String) {

    open val age: Int = 0

    open fun sound() {
        println("$name: som")
    }

}

class Dog(override val age: Int): Animal(name = "Cachorro") {



    override fun sound() {
        println("$name: Au Au")
    }

}

fun main() {

    val dog = Dog(age = 2)

    dog.sound()

    println(dog.age)

}