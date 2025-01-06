package aula_29_genericos

fun <Item> printItem(item: Item){
    println(item)
}

data class Product(val name: String, val amount: Int)

class Container<T>(val items: List<T>): ItemsPrinter<T> {
    fun showItems(){
        println(
            """
                Itens do container:
                ${items.joinToString()}
            """.trimIndent()
        )
    }

    override fun printItem(item: T) {
        println("item: $item")
    }
}

interface ItemsPrinter<T> {
    fun printItem(item: T)
}

fun <T> List<T>.secondOrNull(): T? {
    return if (this.size >= 2) this[1] else null
}

fun <T: Comparable<T>> findMax(a: T, b: T): T {
    return if (a > b) a else b
}

fun main () {

    printItem(item = "kotlin")
    printItem(item = true)
    printItem(item = 1)
    printItem(item = object {
        val name: String = "Hello"
        val x: Double = 100.0
    })

    val container1 = Container(items = listOf(
        Product(name = "Arroz", amount = 10),
        Product(name = "Feijão", amount = 5),
        Product(name = "Macarrão", amount = 3)
    ))

    container1.showItems()

    val container2 = Container(items = listOf(
        "Arroz",
        "Feijão",
        "Macarrão"
    ))

    container2.showItems()
    container2.printItem(item = container2.items.first())

    val productList1 = listOf(
        Product(name = "Arroz", amount = 10),
        Product(name = "Feijão", amount = 5),
    )
    val productList2 = listOf(
        Product(name = "Arroz", amount = 10),
    )
    println(productList1.secondOrNull())
    println(productList2.secondOrNull())

    println(findMax(a = "hello", b = "kotlin"))
    println(findMax(a = 10, b = 100))

}