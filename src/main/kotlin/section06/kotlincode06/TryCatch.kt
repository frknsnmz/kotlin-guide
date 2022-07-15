package section06.kotlincode06

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main(args: Array<String>) {

    println(getNumber("22"))
    println(getNumber("22.5")) // 0

    println(getNumber2("22.5") ?: throw IllegalArgumentException("number is not an int"))
    println(getNumber2("22.5") ?: "something went wrong")

    notImplementedYet("String")


}

fun getNumber(str: String): Int {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        0
    } finally {
        println("I'm in the finally")
    }
}

fun getNumber2(str: String): Int? { // Elvis operato
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        null
    } finally {
        println("I'm in the finally")
    }
}

fun notImplementedYet(something: String): Nothing {
    throw IllegalArgumentException("Implement me")
}