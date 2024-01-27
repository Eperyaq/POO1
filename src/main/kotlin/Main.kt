/*
1. Crear una clase Rectángulo, con atributos base y altura. La clase debe disponer del constructor y los métodos para calcular el area y el perimetro. Los atributos no se podrán modificar, aunque si consultar. Por último, tendrán que ser mayor que 0.

2. Opcionalmente se puede crear el método toString() para mostrar información sobre el rectángulo: override fun toString() = "". (Pulsa Ctrl+o)

3. En el programa principal, crear varios rectángulos. Mostarlos y mostrar por pantalla sus áreas y perímetros.
**/

import java.lang.IllegalArgumentException

/*
1. Crear una clase Rectángulo, con atributos base y altura. La clase debe disponer del constructor y los métodos para calcular el area y el perimetro. Los atributos no se podrán modificar, aunque si consultar. Por último, tendrán que ser mayor que 0.

2. Opcionalmente se puede crear el método toString() para mostrar información sobre el rectángulo: override fun toString() = "". (Pulsa Ctrl+o)

3. En el programa principal, crear varios rectángulos. Mostarlos y mostrar por pantalla sus áreas y perímetros.
**/

class Rectangulo(val base: Double, val altura: Double) {

    var area: Double = 0.0
        get() = calcularArea()
        private set

    var perimetro: Double = 0.0
        get() = calcularPerímetro()
        private set

    init {
        require(base > 0.0 && altura > 0.0) { "La base y la altura deben  ser mayor que 0." }
    }

    constructor(base:Int, altura:Int) : this(base.toDouble(), altura.toDouble())

    private fun calcularArea() = (base * altura)

    fun calcularPerímetro() = 2 * (base + altura)

}



fun main() {
    try {
        val miRectangulo = Rectangulo(7.0, 0.0)
    }
    catch (e: IllegalArgumentException) {
        println(e.message)
    }

    val miRectangulo = Rectangulo(7.0, 5.0)


    println("El área del rectangulo es ${miRectangulo.area}")
    println("El perímetro de mi rectangulo es ${miRectangulo.perimetro}")

    var tuRectangulo = Rectangulo(10, 7)
    println("El area de TU rectangulo es ${tuRectangulo.area}")
    println("El area de TU rectangulo es ${tuRectangulo.perimetro}")

}