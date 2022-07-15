package inheritance

fun main(args: Array<String>) {
    val laserPrinter = LazyPrinter("asd", 15)
    laserPrinter.printModel()

    SomethingElse("whatever")

}

abstract class Printer(val modelName: String) {
    open fun printModel() = println("The model name of this printer is $modelName")
    abstract  fun bestSellingPrice(): Double
}

open class LazyPrinter(modelName: String, ppm: Int): Printer(modelName) {
    final override fun printModel() = println("The model name of this lazy printer $modelName")
    override fun bestSellingPrice(): Double = 120.3
}

class SpecialLazyPrinter(modelName: String, ppm: Int) : LazyPrinter(modelName, ppm) {

}


// secandory constructor mechanism
open class Something: MySubInterface {
    val someProperty: String
    override val number: Int = 25

    constructor(someParameter: String){
        someProperty = someParameter
        println("parent constructor")
    }

    override fun mySubFunction(num: Int): String {
        TODO("Not yet implemented")
    }

    override fun MyFunction(str: String): String {
        TODO("Not yet implemented")
    }


}
class SomethingElse: Something {
    constructor(someOtherParameter: String): super(someOtherParameter) {
        println("child constructor")
    }
}

interface MyInterface {
    val number: Int
    val number2: Int
        get() = number * 100
    fun MyFunction(str: String): String

}

interface MySubInterface: MyInterface {

    fun mySubFunction(num: Int): String

}


