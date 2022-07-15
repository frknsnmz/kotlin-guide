package section05

val MY_CONSTANT = 100

fun main(args: Array<String>) {

    println(MY_CONSTANT)

    val emp = EmployeeTwo("James")
    println(emp.firstName)

    val emp2 = EmployeeTwo("Furkan")
    println(emp2.fullTime)

    val emp3 = EmployeeTwo("Jane", false)
    println(emp3.fullTime)

    println(Demo().dummy)

}

//// First Way - Long way
//class EmployeeTwo constructor(firstName: String) {
//    val firstName: String
//    init {
//        this.firstName = firstName
//    }
//}

//// First Simplification
//class EmployeeTwo constructor(firstName: String) {
//    val firstName: String = firstName
//}

// If you use am then use constructor keyword!
//class EmployeeTwo(val firstName: String) {
//
//}

//// Multiple constructor
//class EmployeeTwo(val firstName: String) {
//    var fullTime: Boolean = true
//    constructor(firstName: String, fullTime: Boolean): this(firstName) {
//        this.fullTime = fullTime
//    }
//}


//// Multiple consturctow consice way
//class EmployeeTwo(val firstName: String, var fullTime: Boolean = true) {
//
//}


// properteis
class EmployeeTwo(val firstName: String, fullTime: Boolean = true) {
    // var deleted so not assigned

    //custom getter stter
    var fullTime = fullTime

    get() {
        println("bla bal")
        return field
    }

    set(value) {
        println("bla bla")
        field = value
    }

}

class Demo {
    val dummy: String
    constructor() {
        dummy = "Hello"
    }
}