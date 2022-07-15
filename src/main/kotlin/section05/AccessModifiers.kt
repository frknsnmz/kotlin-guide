package section05

fun main(args: Array<String>) {
    // private class you can reach without error - in the same file
    val emp = Employee()
    println(emp)

}

private class Employee {

}