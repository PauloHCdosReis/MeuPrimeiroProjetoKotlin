package aula_18_companion_object

class Person {

    companion object {

        const val KEY = "12345678"
        private const val KEY_2 = "1234567898"

        fun getKey(): String {
            return KEY + KEY_2
        }
    }
}

fun main() {

    val key = Person.KEY
    val jose = Person()

    val obtainKey = Person.getKey()
}