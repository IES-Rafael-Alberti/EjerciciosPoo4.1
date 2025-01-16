class Rectangulo(private val base: Double, private val altura: Double) {
    init {
        require(base > 0 && altura > 0) { "La base y la altura deben ser mayores que 0" }
    }

    fun calcularArea(): Double = base * altura

    fun calcularPerimetro(): Double = 2 * (base + altura)

    fun getBase(): Double = base

    fun getAltura(): Double = altura

    override fun toString(): String = "Rectángulo(base=$base, altura=$altura)"
}

fun main() {
    val rectangulos = listOf(
        Rectangulo(5.0, 3.0),
        Rectangulo(7.5, 2.5),
        Rectangulo(10.0, 4.0)
    )

    rectangulos.forEachIndexed { index, rectangulo ->
        println("Rectángulo ${index + 1}:")
        println(rectangulo)
        println("Área: ${rectangulo.calcularArea()}")
        println("Perímetro: ${rectangulo.calcularPerimetro()}")
        println()
    }
}
