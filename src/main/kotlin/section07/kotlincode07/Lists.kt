package section07.kotlincode07

fun main(args: Array<String>) {

    val strings = listOf("spring", "summer", "fall", "winter")
    val colorList = listOf("black", "white", "red")

    println(strings.last())
    println(strings.asReversed())

    println(strings.getOrNull(5))

    val ints = listOf(1,2,3,4,5)

    println(colorList.zip(strings)) // ad soyad birleştirme gibi şeylerde işe yarayabilir

    val mergedList = listOf(colorList, strings)
    println(mergedList)

    val combinedList = colorList + strings
    println(combinedList)

    val noDupsList = colorList.union(strings)
    println(noDupsList) // No duplicate

    val noDupColors = colorList.distinct() // returns a new list
    println(noDupColors) // remove duplicates in single list

}