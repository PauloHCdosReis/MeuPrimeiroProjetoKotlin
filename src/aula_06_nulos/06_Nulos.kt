package aula_06_nulos

fun main() {

    var a: String? = null
    val result: String = a ?: "1"

    println("operador elvis")
    println(result)

    var b: Int = -1
    b = a?.toInt() ?: 0

    println("operador de chamada segura")
    println(b)

    if(a != null) {
        println(a.toInt())
    }

    // operador safe cast

    val c = a as? Int
    println("operador safe cast")
    println(c)

    // método let contra nulos

    println("método let contra nulos")
    b?.let {
        println(it)
    }
}