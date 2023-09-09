class Square(_name: String) : Shape(_name) {

    private var length = 0.0
    private var height = 0.0

    fun setDimension(len: Double, hei : Double) {
        length = len
        height = hei
    }

    override fun printDimensions() {
        println("The length of the ${super.name} is ${length}\n" +
                "The width of the ${super.name} is ${height}")
    }

    override fun getArea(): Double {
        return length * height
    }
}