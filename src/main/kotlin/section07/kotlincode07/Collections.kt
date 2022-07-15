package section07.kotlincode07

fun main(args: Array<String>) {

    val strings = listOf("spring", "summer", "fall", "winter")
    println(strings.javaClass)


    val emptyList = emptyList<String>()
    println(emptyList.javaClass)

    val notNullList = listOfNotNull("hello", null, "goodBye")
    println(notNullList)

    val arraylist = arrayListOf(1,2,4)
    println(arraylist.javaClass)

    val mutableList = mutableListOf<Int>(1,2,4)
    println(mutableList.javaClass)

    val array = arrayOf("black", "white", "green")
    val colorList = array.toList()
    val colorListOtherWay = listOf(*array)
    println(colorList)

}