package aula_24_classes_enumeradas

enum class Direction(val description: String) {
    NORTH(description = "Direção norte.") { // 0
        override fun symbol(): Char {
            return '↑'
        }

        override val symbol: Char
            get() = '↑'
    },
    SOUTH(description = "Direção sul.") { // 1
        override fun symbol(): Char {
            return '↓'
        }

        override val symbol: Char
            get() = '↓'
    },
    EAST(description = "Direção leste.") {  // 2
        override fun symbol(): Char {
            return '→'
        }

        override val symbol: Char
            get() = '→'
    },
    WEST(description = "Direção oeste.") {  // 3
        override fun symbol(): Char {
            return '←'
        }

        override val symbol: Char
            get() = '←'
    };

    companion object {
        fun sumDirections(firstDirection: Direction, secondDirection: Direction) {
            println(firstDirection)
            println(secondDirection)
        }
    }

    fun addDirection(direction: Direction) {
        println(this.description)
        println(direction.description)
    }

    abstract fun symbol(): Char
    abstract val symbol: Char
}

fun main() {

    var north = Direction.NORTH

//    println(north.ordinal)
//    println(north.name)
//    println(north.description)
//
//    north.addDirection(direction = Direction.EAST)
//
//    Direction.sumDirections(firstDirection = Direction.SOUTH, secondDirection = Direction.WEST)

    // Entries

    Direction.entries.forEach { item ->
        println(item.ordinal)
        println(item.name)
        println(item.description)
        println(item.symbol() + " | " + item.symbol)
        if (item.ordinal != 3) println("===========")
    }

    println(Direction.valueOf("NORTH").ordinal)
}