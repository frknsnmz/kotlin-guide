package section07.kotlincode07

import java.lang.StringBuilder

fun main(args: Array<String>) {

    val ints = listOf(1, 2, 3, 4, 5)
    val shorts: List<Short> = listOf(10, 20, 30, 40)
    val floats = listOf(10.3f)
    val strings = listOf("1", "2")

    convertToInt(ints)
    convertToInt(shorts)
    convertToInt(floats)

    append(StringBuilder("String 1"), StringBuilder("String 2"))

}

fun <T> append(item: T, item2: T)
        where T : CharSequence, T : Appendable {
    println("Result is ${item.append(item2)}")
}

fun <T : Number> convertToInt(collection: List<T>) {
    for (num in collection) {
        println("${num.toInt()}")
    }
}

