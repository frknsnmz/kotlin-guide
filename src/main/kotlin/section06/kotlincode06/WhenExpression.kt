package section06.kotlincode06

import java.math.BigDecimal

enum class Season {
    SPRING, SUMMER, FALL, WINTER
}

fun main(args: Array<String>) {

    val timeOfYear = Season.WINTER
    val str = when (timeOfYear) {
        Season.WINTER -> "asd"
        Season.FALL -> "qsdq"
        Season.SUMMER -> "qwdqw"
        Season.SPRING -> "dqsd"
    }
    println(str)


    val num = 200
    when(num) {
        100 -> println("100")
        200 -> println("200")
        else -> println("not matched")
    }

    when(num) {
        100, 600 -> println("100")
        200 -> println("200")
        else -> println("not matched")
    }

    when(num) {
        in 100..200 -> println("100")
        200 -> println("200")
        else -> println("not matched")
    }

    val y = 10
    when(num) {
        y + 80 -> println("100")
        200 -> println("200")
        else -> println("not matched")
    }

    val obj: Any = "I am a string"
    val obj2: Any = BigDecimal(25.2)
    val obj3: Any = 45
    val something: Any = obj2
    val z = when(something) {
        is String -> "blalba"
        is BigDecimal -> "qlwdqw"
        is Int -> "qwdqwd"
        else -> println("now you can assign a value to this when expression")
    }
    println(z) // -> Kotlin.unit

    val x = 50
    val q = -50
    when { // better than if else!
        x < q -> println("a")
        x > q -> println("asd")
        else -> println("qwdq")
    }
}