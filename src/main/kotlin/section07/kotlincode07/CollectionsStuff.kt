package section07.kotlincode07

fun main(args: Array<String>) {

    val setInts = setOf(10, 15, 19, 5, 3, -22)
    println(setInts.filter { it % 2 != 0 })


    val immutableMap = mapOf<Int, CarCS>(
        1 to CarCS("a", "b", 1),
        2 to CarCS("c", "d", 2)
    )
    println(immutableMap.map { it.value.year })
    println(immutableMap.filter { it.value.year == 2019 }.map { it.value.color })
    println(immutableMap.all { it.value.year > 1000 }) // false
    println(immutableMap.any { it.value.year > 1000 }) // at least one of them matches
    println(immutableMap.count { it.value.year > 1000 })
    val cars = immutableMap.values
    println(cars.sortedBy { it.year })



    val mutableMap = mutableMapOf<Int, CarCS>(
        1 to CarCS("a", "b", 1),
        2 to CarCS("c", "d", 2)
    )
    println(mutableMap.filter { it.value.color == "a" })


    val ints = arrayOf(1, 2, 3, 4, 5)
//    val add10List: MutableList<Int> = mutableListOf();
//    for (i in ints) {
//        add10List.add(i + 10)
//    }
//    println(add10List)
    val add10List = ints.map { it + 10 }



}


data class CarCS(val color: String, val model: String, val year: Int) {

}