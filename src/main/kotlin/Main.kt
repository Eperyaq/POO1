/*
1. Crear una clase Rectángulo, con atributos base y altura. La clase debe disponer del constructor y los métodos para calcular el area y el perimetro. Los atributos no se podrán modificar, aunque si consultar. Por último, tendrán que ser mayor que 0.

2. Opcionalmente se puede crear el método toString() para mostrar información sobre el rectángulo: override fun toString() = "". (Pulsa Ctrl+o)

3. En el programa principal, crear varios rectángulos. Mostarlos y mostrar por pantalla sus áreas y perímetros.
**/

class Rectangulo(base: Double, altura: Double, color: String){

    constructor(base:Double = 1.0, altura:Double = 1.0) : this(base, altura, color = "Red") { // No entiendo porque no me deja...
        var base: Double = this
    }

    fun calcularArea(base: Double, altura: Double): Double{
        var area = (base * altura)

        return area
    }

    fun calcularPerímetro(base: Double, altura:Double): Double{
        var perimetro = 2 * (base + altura)

        return perimetro
    }

    override fun toString(): String {
        return super.toString()
    }
}



fun main() {
    var miRectangulo = Rectangulo(20.0, 10.0)
    println("El área del rectangulo es ${miRectangulo.calcularArea(20.0, 10.0)}") //No hay alguna manera de meterle los datos que ya tiene la variable??
    println("El perímetro de mi rectangulo es ${miRectangulo.calcularPerímetro(20.0 ,10.0)}")

    var tuRectangulo = Rectangulo()
    println("El area de TU rectangulo es ${tuRectangulo.calcularArea()}")//No deberian pasarse los valores por defecto?
    println("El area de TU rectangulo es ${tuRectangulo.calcularPerímetro()}")

}

