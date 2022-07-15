package section05

fun main(args: Array<String>) {

    val car = Car("blue", "bmw",2015)
    println(car)
    val car2 = car.copy()
    println(car2)
    val car3 = car.copy(year = 2022)
    println(car3)

}

data class Car (val color: String, val model: String, val year: Int) {

}