import java.text.DecimalFormat
import java.util.Scanner

fun main() {

    val reader = Scanner(System.`in`)

    // Create a square and ask the user for its sides
    val square: Shape = Square("square")
    print("Enter the length of the ${square.name}: ")
    val square_len = reader.nextDouble()
    print("Enter the height of the ${square.name}: ")
    val square_hei = reader.nextDouble()
    (square as Square).setDimension(square_len, square_hei)

    // Create a circle and ask the user for its radius
    val circle: Shape = Circle("circle")
    print("Enter the radius of the ${circle.name}: ")
    val radius = reader.nextDouble()
    (circle as Circle).setDimension(radius)

    // Create a triangle and ask the user for its sides
    val triangle: Shape = Triangle("triangle")
    print("Enter the 1st side of the ${triangle.name}: ")
    val first_side = reader.nextDouble()
    print("Enter the 2nd side of the ${triangle.name}: ")
    val second_side = reader.nextDouble()
    print("Enter the 3rd side of the ${triangle.name}: ")
    val third_side = reader.nextDouble()
    (triangle as Triangle).setDimension(first_side, second_side, third_side)

    // Create a equilateral triangle and ask the user for its side
    val equilateral_triangle: Shape = EquilateralTriangle("equilateral triangle")
    print("Enter the side of the ${equilateral_triangle.name}: ")
    val side = reader.nextDouble()
    (equilateral_triangle as EquilateralTriangle).setDimension(side)

    // Display shapes
    println("\nHere's the information of all the shapes")
    displayShapeInfo(square)
    displayShapeInfo(circle)
    displayShapeInfo(triangle)
    displayShapeInfo(equilateral_triangle)
}

fun displayShapeInfo(shape: Shape) {
    // Create a format decimal to the nearest hundred
    val dec = DecimalFormat(".00")
    println("==================================\n${shape.name.capitalize()}")
    shape.printDimensions()
    println("The area of the ${shape.name} is ${dec.format(shape.getArea())}")
}