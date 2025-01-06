package aula_09_operadores_matematicos

import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.log10
import kotlin.math.pow

fun main() {

    val num = 4
    val num2 = 2

    // básicos
    println(num + num2)
    println(num - num2)
    println(num * num2)
    println(num / num2)
    println(num % num2)

    // incremento e decremento

    var num3 = 10
    var num4 = 20

    num3++
    num4--

    println(num3)
    println(num4)

    // atribuição composta
    println("atribuição composta")

    var num5 = 1

    println("+=")
    num5 += num // num5 = 1 + 4 = 5
    println(num5)

    println("-=")
    num5 -= num // num5 = 5 - 4 = 1
    println(num5)

    println("*=")
    num5 *= num // num5 = 1 * 4 = 4
    println(num5)

    println("/=")
    num5 /= num // num5 = 4 / 4 = 1
    println(num5)

    println("%=")
    num5 %= num // num5 = 1 % 4 = 1
    println(num5)

    // biblioteca math

    println("biblioteca math")

    val value = 2.9
    val valueRounded = Math.round(value)

    println(valueRounded)

    val valueFloor = floor(value)
    println(valueFloor)

    val valueCeil = ceil(value)
    println(valueCeil)

    val base = 2.0
    val exponent = 3.0
    val valuePow = base.pow(exponent) // 2^3 = 2 * 2 * 2 = 8

    println(valuePow)

    val logValue = log10(100.0) // 10 * 10 = 100
    println(logValue)

}