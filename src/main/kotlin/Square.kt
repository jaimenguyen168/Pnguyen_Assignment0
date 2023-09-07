class Square(_name: String) : Shape(_name) {

    private var length = 0.0
    private var width = 0.0

    fun setDimension(len: Double, wid : Double) {
        length = len
        width = wid
    }

    override fun printDimension() {
        println("The length of the ${super.name} is ${length}\n" +
                "The width of the ${super.name} is ${width}\n")
    }
}