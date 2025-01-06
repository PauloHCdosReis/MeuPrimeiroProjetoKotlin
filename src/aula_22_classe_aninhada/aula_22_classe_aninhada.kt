package aula_22_classe_aninhada

class Car(val model: String, val year: Int){

    object Engine {

        data class FuelType(val typeName: String) {
            fun fuelCar() {
                println("Abastecendo o carro com $typeName")
            }
        }

        fun start() {
            println("Ligando...")
        }

    }

}

fun main () {

    var car = Car(model = "Chevrolet Onix", year = 2021)
    val carEngine = Car.Engine

    val engine = Car.Engine

    val fuelType = Car.Engine.FuelType(typeName = "Gasolina")

}