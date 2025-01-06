package aula_23_classes_internas

class Car(val model: String, val year: Int){

    inner class Engine {

        inner class Fuel(val typeName: String) {
            fun fuelCar() {
                println("Abastecendo o carro $model com $typeName")
                start()
            }
        }

        fun start() {
            println("Ligando Carro do modelo $model e do ano $year...")
        }

    }

}

fun main () {

    val carEngine = Car(model = "Chevrolet Onix", year = 2021).Engine()

    val carEngineFuelType = carEngine.Fuel(typeName = "Gasolina")

    // carEngine.start()

    carEngineFuelType.fuelCar()
}