package aula_12_funcoes_anonimas

fun main () {

    var sum = 2 + 2

    val funSum = {
        a:Int, b:Int ->
        {
            sum = 100
            a + b
        }
    }

    println(funSum(1, 4).invoke())
    println(sum)
}