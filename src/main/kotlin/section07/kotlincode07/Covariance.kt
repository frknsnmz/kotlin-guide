package section07.kotlincode07

fun main(args: Array<String>) {

    val shortList: List<Short> = listOf(1, 2, 4)
    convertToInt(shortList)

}

fun convertToInt(collection: List<Number>) {
    for (num in collection) {
        println("${ num.toInt() }")
    }
}


fun tendGarden(roseGarden: Garden<Rose>) {
    waterGarden(roseGarden)
}

fun waterGarden(garden: Garden<Flower>) {

}

open class Flower {

}

class Rose: Flower() {

}

class Garden<out T: Flower> { // out keyword make this class covariant - you can read them but you can not add anything

    val flowers: List<T> = listOf()

    fun pickFlower(i: Int): T = flowers[i]


}