package aula_20_classes_de_dados

class UserClass(val name: String, val age: Int)

data class UserDataClass(val name: String, val age: Int)

fun main() {

    val userClass = UserClass(name = "João", age = 20)
    val userDataClass = UserDataClass(name = "João 2", age = 21)

    // toString

    println(userClass.toString())
    println(userDataClass)

    // equals

    val jose = UserDataClass(name = "José", age = 20)
    val jose2 = UserDataClass(name = "José", age = 20)
    val maria = UserDataClass(name = "Maria", age = 22)

    val userClass2 = UserClass(name = "João", age = 20)
    val userClass3 = userClass

    println(jose == maria)
    println(jose == jose2)
    println(userClass == userClass2)
    println(userClass == userClass3)

    // copy

    val copyMaria = maria.copy(age = 50)

    println(copyMaria)

    val ( name, age ) = jose
}