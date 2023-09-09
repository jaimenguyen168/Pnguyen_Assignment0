class Circle(_name: String) : Shape(_name) {
    private var radius = 0.0

    fun setDimension(rad: Double) {
        radius = rad
    }

    override fun printDimensions() {
        println("The radius of the ${super.name} is ${radius}")
    }

    override fun getArea(): Double {
        return Math.PI * radius * radius
    }
}