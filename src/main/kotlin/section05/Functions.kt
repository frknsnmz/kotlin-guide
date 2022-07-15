package section05

fun main(args: Array<String>) {
    println(labelMultiply(3,4))

    val emp = EmployeeFour("Furkan")
    println(emp.upperCaseFirstName())

    val car1 = Car("a", "b", 2323)
    val car3 = Car("c", "b", 2323)

    // printColors(car1, car3, str = "abc")
    printColors(car1, car3)

    val manyCars = arrayOf(car1, car3)
    println(manyCars)

    println(Utils().upperFirstAndLast("this is all in lowercase"))

    val s = "this is all lower"
    println(s.upperFirstAndLast())

}
// Extension function
fun String.upperFirstAndLast(): String {
    val upperFirst = substring(0,1).toUpperCase() + substring(1)
    return upperFirst.substring(0, upperFirst.length-1) +
            upperFirst.substring(upperFirst.length-1 ,upperFirst.length).toUpperCase()
}

fun printColors(vararg cars: Car) {
    for (car in cars) {
        println(car.color)
    }
}

//fun printColors(vararg cars: Car, str: String) {
//    for (car in cars) {
//        println(car.color)
//    }
//}


//fun labelMultiply(operand1: Int, operand2: Int, label: String): String {
//    return ("$label ${operand1 * operand2}")
//}

fun labelMultiply(operand1: Int, operand2: Int,
                  label: String = "The Answer is: ") =
    ("$label ${operand1 * operand2}")

inline fun labelMultiply2(operand1: Int, operand2: Int,
                  label: String = "The Answer is: ") =
    ("$label ${operand1 * operand2}")


// fun whatever(): Unit = 3*4 ERROR! VOID TYPE

class EmployeeFour(val firstName: String) {
    fun upperCaseFirstName() = firstName.toUpperCase()
}

data class CarTwo(val color: String, val model: String, val year: Int) {

}