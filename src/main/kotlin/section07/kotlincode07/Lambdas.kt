package section07.kotlincode07

fun main(args: Array<String>) {

    run { println("I in lambda") }

    val employees = listOf(Employee("John", "Smith", 2012),
        Employee("John2", "Smith2", 2015),
        Employee("John3", "Smith3", 2017),
        Employee("John4", "Smith4", 2019))

    println(employees.minByOrNull(Employee::startYear))
    println(employees.minByOrNull { it.startYear })

    var num = 10
    run {
        num += 15
        println(num)
    }

    run(::toplevel)

    println(countTo100())

    "SomeString".apply somestring@{
        "Another String".apply {
            println(lowercase())
            println(this@somestring.uppercase())
        }
    }
}

fun useParameter(employees: List<Employee>, num: Int) {
    employees.forEach {
        println(it.firstName)
        println(num)
    }
}

fun toplevel () = println("hey example")


fun countTo100Updated() =
    with(StringBuilder()) {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
    append(100)
        toString()
}
fun countTo100(): String {
    val numbers = StringBuilder()
    for (i in 1..99) {
        numbers.append(i)
        numbers.append(", ")
    }
    numbers.append(100)
    return numbers.toString()
}

fun findByLastName(employees: List<Employee>, lastName: String) {
    employees.forEach returnblock@ {
        if (it.lastName == lastName) {
            println("yeii")
            return@returnblock
        }
    }
    println("noii")
}

data class Employee(val firstName: String, val lastName: String, val startYear: Int) {

}