class EquilateralTriangle(_name: String) : Triangle(_name) {

    fun setDimension(s: Double) {
        super.setDimension(s, s, s)
    }

    override fun getArea(): Double {
        return super.getArea()
    }

    override fun printDimensions() {
        println("All the sides of the ${super.name} are ${super.side1}")
    }
}