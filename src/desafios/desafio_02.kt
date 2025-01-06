package desafios

import desafios.ClassificacaoIMC.Companion.gerarClassificacao
import kotlin.math.pow

fun validarKg(kg: Double?): Boolean =
    !(kg == null || kg < 0 || kg > 300)


fun validarM(m: Double?): Boolean =
    !(m == null || m < 0 || m > 3)

fun calcularIMC(kg: Double, m: Double): Double =
    kg / m.pow(2)

fun classificarIMC(imc: Double): String =
    when {
        imc < 18.5 -> "Abaixo do peso"
        imc < 24.9 -> "Peso normal"
        imc < 29.9 -> "Sobrepeso"
        imc < 34.9 -> "Obesidade grau 1"
        imc < 39.9 -> "Obesidade grau 2"
        imc > 39.9 -> "Obesidade grau 3"
        else -> "IMC inválido"
    }

enum class ClassificacaoIMC(val descricao: String) {
    ABAIXO_DO_PESO("Abaixo do peso"),
    PESO_NORMAL("Peso normal"),
    SOBREPESO("Sobrepeso"),
    OBESIDADE_GRAU_1("Obesidade grau 1"),
    OBESIDADE_GRAU_2("Obesidade grau 2"),
    OBESIDADE_GRAU_3("Obesidade grau 3"),
    IMC_INVALIDO("IMC inválido");

    companion object {
        fun gerarClassificacao(imc: Double): ClassificacaoIMC {
            return when {
                imc < 18.5 -> ABAIXO_DO_PESO
                imc < 24.9 -> PESO_NORMAL
                imc < 29.9 -> SOBREPESO
                imc < 34.9 -> OBESIDADE_GRAU_1
                imc < 39.9 -> OBESIDADE_GRAU_2
                imc > 39.9 -> OBESIDADE_GRAU_3
                else -> IMC_INVALIDO
            }
        }
    }
}

fun main() {

    println("Insira o seu peso:")
    print("Kg: ")
    val kg = readlnOrNull()?.toDoubleOrNull()

    if (!validarKg(kg)) {
        println("KG inválidos.")
        return
    }

    println("Insira a sua altura:")
    print("Metros: ")
    val m = readlnOrNull()?.toDoubleOrNull()

    if (!validarM(m)) {
        println("Metros inválidos.")
        return
    }

    val imc = calcularIMC(kg = kg!!, m = m!!)

    val classificacaoIMC = gerarClassificacao(imc = imc)

    println("Seu IMC é: ${"%.1f".format(imc)} e sua classificação é: ${classificacaoIMC.descricao}")

}