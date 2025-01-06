package aula_31_funcao_inline_tipo_reified

inline fun executeAction(action1: () -> Unit, action2: () -> Unit, action3: () -> Unit) {
    println("Iniciando a ação...")
    action1()
    action2()
    action3()
    println("Finalizando a ação...")
}

inline fun <reified T> printTypeName() {
    println(T::class.simpleName)
}

fun main() {

    printTypeName<String>()
    printTypeName<Int>()

}