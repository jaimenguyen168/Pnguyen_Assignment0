import kotlin.math.sqrt

open class Triangle(_name: String) : Shape(_name) {
    protected var side1 = 0.0
    protected var side2 = 0.0
    protected var side3 = 0.0

    fun setDimension(s1: Double, s2 : Double, s3: Double) {
        side1 = s1
        side2 = s2
        side3 = s3
    }

    override fun printDimensions() {
        println("The sides of the ${super.name} are listed as " +
                "${side1}, ${side2}, and ${side3}")
    }

    override fun getArea(): Double {
        var s = 0.5 * (side1 + side2 + side3)
        return sqrt(s * (s-side1) * (s-side2) * (s-side3))
    }
}