package section07.kotlincode07

import java.math.BigDecimal

fun main(args: Array<String>) {


    // val list: MutableList<String> = mutableListOf("Hello");
    val list = mutableListOf("Hello")
    list.add("aaa")
    printCollection(list)


    val bdList = mutableListOf(BigDecimal(-33.45))
    printCollectionGen(bdList)
    bdList.printCollectionExtension()
}

fun printCollection(collection: List<String>) {
    for (item in collection) {
        println(item)
    }
}


fun <T> printCollectionGen(collection: List<T>) {
    for (item in collection) {
        println(item)
    }
}

// bdList.printCollectionExtension()
fun <T> List<T>.printCollectionExtension() {
    for (item in this) {
        println(item)
    }
}