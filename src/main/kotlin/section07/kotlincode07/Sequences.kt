package section07.kotlincode07

fun main(args: Array<String>) {

    val immutableMap = mapOf<Int, CarSeq>(
        1 to CarSeq("a", "b", 1),
        2 to CarSeq("c", "d", 2)
    )

    println(immutableMap.asSequence().filter { it.value.model == "a" }.map { it.value.color })

    listOf("Joe", "Mary", "Jane").asSequence()
        .filter { println("filterin, $it"); it[0] == 'J' }
        .map { println("mappin $it"); it.uppercase() }
        .toList()

}

data class CarSeq(val color: String, val model: String, val year: Int) {

}