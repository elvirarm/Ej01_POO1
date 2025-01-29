
class Rectangulo (base: Int, altura: Int) {

    init{
        require(base > 0){"La base debe ser un número positivo"}
        require(altura > 0){"La altura debe ser un número positivo"}
    }

    var base: Int = base
        private set

    var altura: Int = altura
        private set


    fun calcularArea(): Int{
        val area = base * altura
        return area
    }

    fun calcularPerimetro(): Int{
        val perimetro = (base * 2) + (altura * 2)
        return perimetro
    }

    override fun toString(): String {
        return "Información del rectángulo. Base: $base, Altura: $altura . Área: ${calcularArea()} . Perímetro: ${calcularPerimetro()} "
    }
}