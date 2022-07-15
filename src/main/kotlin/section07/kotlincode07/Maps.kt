package section07.kotlincode07

fun main(args: Array<String>) {

    val setInts = setOf(10, 15, 19, 5, 3, -22)
    println(setInts.plus(20))
    println(setInts.minus(19))
    println(setInts.average())
    println(setInts.drop(3))


    val mutableInts = mutableSetOf(1,2,3,4,5)
    mutableInts.plus(10)
    println(mutableInts) // does not change..


    val immutableMap = mapOf<Int, Car>(1 to Car("green", "toyato", 2005),
        2 to Car("red", "asd", 2006));
    println(immutableMap.javaClass) // LinkedHashMap
    println(immutableMap)

    val mutableMap = hashMapOf<String, Car>("John's car" to Car("a","b",123))

    for (entry in mutableMap) {
        println(entry.key)
        println(entry.value)
    }

    for ((key,value) in mutableMap) {
        println(key)
        println(value)
    }


    val pair = Pair(10, "ten")
    val(firstVal, secondVal) = pair
    println(firstVal)
    println(secondVal)

    val car = Car("a", "b", 123)
    val (color, model, year) = car
    println("color = $color, model = $model")


}

class Car(val color: String, val model: String, val year: Int) {

    // if you make this class "data class" then you dont need to use those anymore
    operator fun component1() = color
    operator fun component2() = model
    operator fun component3() = year


}