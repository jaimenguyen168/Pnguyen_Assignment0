import java.util.Scanner

fun main() {

    val reader = Scanner(System.`in`)

    val square : Shape = Square("square")
    print("Enter the length of the ${square.name}: ")
    val square_len = reader.nextDouble()
    print("Enter the height of the ${square.name}: ")
    val square_hei = reader.nextDouble()

    (square as Square).setDimension(square_len, square_hei)
    displayShapeInfo(square)

    val circle : Shape = Circle("circle")
    print("Enter the radius of the ${circle.name}: ")
    val radius = reader.nextDouble()

    (circle as Circle).setDimension(radius)
    displayShapeInfo(circle)

    val triangle : Shape = Triangle("triangle")
    print("Enter the 1st side of the ${triangle.name}: ")
    val first_side = reader.nextDouble()
    print("Enter the 2nd side of the ${triangle.name}: ")
    val second_side = reader.nextDouble()
    print("Enter the 3rd side of the ${triangle.name}: ")
    val third_side = reader.nextDouble()

    (triangle as Triangle).setDimension(first_side, second_side, third_side)
    displayShapeInfo(triangle)

    val equilateral_triangle : Shape = EquilateralTriangle("equilateral triangle")
    print("Enter the side of the ${equilateral_triangle.name}: ")
    val side = reader.nextDouble()

    (equilateral_triangle as EquilateralTriangle).setDimension(side)
    displayShapeInfo(equilateral_triangle)
}

fun displayShapeInfo(shape : Shape) {
    println("==================================\nHere's the information of the ${shape.name}\n==================================")
    shape.printDimensions()
    println("The area of the ${shape.name} is ${shape.getArea()}\n\n" +
            "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n")
}